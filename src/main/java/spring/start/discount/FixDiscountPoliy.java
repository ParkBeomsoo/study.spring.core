package spring.start.discount;

import spring.start.member.Grade;
import spring.start.member.Member;

public class FixDiscountPoliy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
