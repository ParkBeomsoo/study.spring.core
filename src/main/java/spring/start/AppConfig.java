package spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.start.discount.DiscountPolicy;
import spring.start.discount.RateDiscountPolicy;
import spring.start.member.MemberService;
import spring.start.member.MemberServiceImpl;
import spring.start.member.MemoryMemberRepository;
import spring.start.order.OrderService;
import spring.start.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
