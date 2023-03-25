package pao.laborator4.inheritance.multiple;

interface CanJump {
    void jump();
}

interface CanClimb {
    void climb();
}

interface CanSlam {
    void slam();
}

interface CyberJump extends CanJump, CanClimb, CanSlam {}

class ActionCharacter {
    public void jump() {
        System.out.println("ActionCharacter can jump");
    }
}

class Child extends ActionCharacter implements CyberJump {

    @Override
    public void climb() {
        System.out.println("Child can climb");
    }

    @Override
    public void slam() {
        System.out.println("Child can slam");
    }
}
public class Play {
    static void testCanJump(CanJump x) {
        CanJump x1 = new Child();
        x.jump();
    }

    static void testCanClimb(CanClimb x) {
        CanClimb x1 = new Child();
        x.climb();
    }

    static void testCanSlam(CanSlam x) {
        CanSlam x1 = new Child();
        x.slam();
    }

    static void testActionCharacter(ActionCharacter x) {
        ActionCharacter x1 = new Child();
        x.jump();
    }
    public static void main(String[] args) {
        Child child = new Child();

        testCanJump(child);
        testCanClimb(child);
        testCanSlam(child);
        testActionCharacter(child);
    }
}
