package spring.start.scan;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.AutoAppConfig;
import spring.start.discount.DiscountPolicy;
import spring.start.member.MemberService;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        DiscountPolicy discountPolicy = ac.getBean(DiscountPolicy.class);
        System.out.println("discountPolicy = " + discountPolicy);


        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
