package Ngay64;

public class Fan1 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3= new Fan(3,true,15,"Red");
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("Yellow");
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan(fan1));
        System.out.println(fan(fan2));
        System.out.println(fan(fan3));
    }

    public static String fan(Fan fan) {
        if (fan.isOn()) {
            return "Fan{" +
                    "fan is on" +
                    ", speed=" + fan.getSpeed() +
                    ", radius=" + fan.getRadius() +
                    ", color='" + fan.getColor() + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    "fan is off" +
                    ", radius=" + fan.getRadius() +
                    ", color='" + fan.getColor() + '\'' +
                    '}';
        }
    }
}
