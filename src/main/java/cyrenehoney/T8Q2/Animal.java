package cyrenehoney.T8Q2;

import lombok.Getter;

@Getter
public class Animal extends Organism {
    private int eatAmount;

    public Animal(int initialSize, int growthRate, int eatAmount) {
        super(initialSize, growthRate);
        this.eatAmount = eatAmount;
    }

    // Java 默认虚方法，写不写没区别，写是为了标准
    // Object vtable 0 0x1  Animal vtable 0 0x2  0 => FixedOffset 固定偏移量, O(1)

    // C# 默认非虚，直接inline call，而virtual需要查null, 查MethodTable，相对开销大
    /*
        void Feed(Animal a) {
            a.Eat(); // 虚方法调用，C# JIT无法内联
        }
        // 已引入动态 PGO，.NET 8 后效率基本一致

        if (a.getClass() == Dog.class) {
            System.out.println("吃骨头"); // 收集到概率大后，JVM 内联缓存
        } else {
            call_virtual(a, "Eat"); 
        }
    */

    // TODO: itable shit fuck lazy learn
    @Override
    public String toString() {
        return "Animal{initialSize=" + getInitialSize() +
        ", growthRate=" + getGrowthRate() + ", eatAmount=" + getEatAmount() + "}";
    }
}
