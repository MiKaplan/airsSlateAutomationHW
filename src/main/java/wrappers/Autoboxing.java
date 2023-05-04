package wrappers;

import java.util.Scanner;

public class Autoboxing {
    public static void main(String[] args) {
        boolean primitiveBoolean = true;
        byte primitiveByte = 2;
        short primitiveShort = 19;
        int primitiveInt = 500;
        long primitiveLong = 10000;
        float primitiveFloat = 4.5F;
        double primitiveDouble = 104.7;
        char primitiveChar = 'f';

        Boolean wrapperBoolean = primitiveBoolean;
        Byte wrapperByte = primitiveByte;
        Short wrapperShort = primitiveShort;
        Integer wrapperInt = primitiveInt;
        Long wrapperLong = primitiveLong;
        Float wrapperFloat = primitiveFloat;
        Double wrapperDouble = primitiveDouble;
        Character wrapperCharacter = primitiveChar;

        System.out.println("Autoboxing boolean: " + wrapperBoolean + ", " + wrapperBoolean.getClass().getName());
        System.out.println("Autoboxing byte: " + wrapperByte + ", " + wrapperByte.getClass().getName());
        System.out.println("Autoboxing short: " + wrapperShort + ", " + wrapperShort.getClass().getName());
        System.out.println("Autoboxing int: " + wrapperInt + ", " + wrapperInt.getClass().getName());
        System.out.println("Autoboxing long: " + wrapperLong + ", " + wrapperLong.getClass().getName());
        System.out.println("Autoboxing float: " + wrapperFloat + ", " + wrapperFloat.getClass().getName());
        System.out.println("Autoboxing double: " + wrapperDouble + ", " + wrapperDouble.getClass().getName());
        System.out.println("Autoboxing char: " + wrapperCharacter + ", " + wrapperCharacter.getClass().getName());

        boolean unboxingBoolean = wrapperBoolean;
        byte unboxingByte = wrapperByte;
        short unboxingShort = wrapperShort;
        int unboxingInt = wrapperInt;
        long unboxingLong = wrapperLong;
        float unboxingFloat = wrapperFloat;
        double unboxingDouble = wrapperDouble;
        char unboxingChar = wrapperCharacter;


            System.out.println("Unboxing boolean: " + unboxingBoolean);
            System.out.println("Unboxing byte: " + unboxingByte);
            System.out.println("Unboxing short: " + unboxingShort);
            System.out.println("Unboxing int: " + unboxingInt);
            System.out.println("Unboxing long: " + unboxingLong);
            System.out.println("Unboxing float: " + unboxingFloat);
            System.out.println("Unboxing double: " + unboxingDouble);
            System.out.println("Unboxing char: " + unboxingChar);

    }
}
