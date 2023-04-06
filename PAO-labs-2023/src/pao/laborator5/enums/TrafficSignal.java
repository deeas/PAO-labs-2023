package pao.laborator5.enums;

public enum TrafficSignal {
    /*We have to create parameterized constructor for this enum class.
    Why? Because as we know that enum class’s object can’t be create explicitly so
    for initializing we use parameterized constructor. And the constructor cannot be the public or protected it must have private or
    default modifiers. Why? if we create public or protected, it will allow initializing more than one objects.
    This is totally against enum concept.
    We need the enum constructor to be private because enums define a finite set of values (SMALL, MEDIUM, LARGE). If the constructor was public, people could potentially create more value. (for example, invalid/undeclared values such as ANYSIZE, YOURSIZE, etc.).

Enum in Java contains fixed constant values. So, there is no reason in having a public or protected constructor as you cannot create an enum instance. Also, note that the internally enum is converted to class. As we can’t create enum objects explicitly, hence we can’t call the enum constructor directly.
    We have to create one getter method to get the value of enums.*/
    // This will call enum constructor with one String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private TrafficSignal(String action)
    {
        this.action = action;
    }
}
