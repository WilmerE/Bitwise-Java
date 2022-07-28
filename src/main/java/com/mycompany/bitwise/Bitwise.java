/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bitwise;

/**
 *
 * @author wilme
 */
public class Bitwise {
    /*
    **================= Numbers convert to binary and each bit is operated =================
    **NOTE: byte = 8bits, short = 16bits int = 32bits, long = 64bits.
    */

    public static void main(String[] args) {
        /*
        **AND = &: example
        **{5 = 0000 0101} and {3 = 0000 0011}  result = 0000 0001
        **output is 1
        */
        byte a = 5;
        a &= 3;
        
        /*
        **inclusive OR = |: example
        **{5 = 0000 0101} and {3 = 0000 0011}  result = 0000 0111
        **output is 7
        */
        byte b = 5;
        b |= 3;
        
        /*
        **exclusive XOR = |: example
        **{5 = 0000 0101} and {3 = 0000 0011}  result = 0000 0110
        **output is 6
        */
        byte c = 5;
        c ^= 3;
        
        /*
        **unary operator = ~: example
        **{5 = 0000 0101} all bits are inverted. result = 0000 1010 (10 in decimal)
        **2’s complement of (10) will be {1111 0110} (-6 in decimal).
        **The most significant bit represents the sign. 0 = (+) | 1 = (-) 
        */
        byte d = ~5;
        
        /*
        **NOT: example
        **{5 = 0000 0101} invert 1111 1010
        **2’s complement {-0000 0110} & {3 = 0000 0011} result = 0000 0010
        **{3 = 0000 0011} invert 1111 1100
        **2’s complement {-0000 0100} & {5 = 0000 0101} result = 0000 0100
        **OR result of the two ANDs 0000 0110 (6 in decimal)
        */
        byte e = (~5 & 3)|(5 & ~3);
        
        /*
        **Left Shift = <<: example
        **The left shift operator moves all bits by a given number of bits to the left.
        **{5 = 0000 0101} move 3 position result = 0010 1000 (40 in decimal) or (5*2^3 => 5*8 = 40)
        */
        byte f = 5<<3;
        
        /*
        **Right Shift = >>:example
        **The right shift operator moves all bits by a given number of bits to the right.
        **{8 = 00000 1000} move 2 position result = 0000 0010 (2 in decimal) or (8/2^2 => 8/4 = 2)
        */
        byte g = 8>>2;
        
        /*
        **Zero Fill Right Shift = >>>:example
        **It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
        **{8 = 0000 0000 0000 0000 0000 0000 0000 1000} >>> result = 0000 0000 0000 0000 0000 0000 0000 0010 (2 in decimal)
        **{-8 = 1111 1111 1111 1111 1111 1111 1111 1000} >>> result = 0011 1111 1111 1111 1111 1111 1111 1110 (1073741822 in decimal)
        */
        
        byte h = 8>>>2;
        int j = -8>>>2;
        
        //outputs
        System.out.println("&= : " +a); //operator &
        System.out.println("|= : " +b); //operator |
        System.out.println("^= : " +c); //operator ^
        System.out.println(" ~ : " +d); //operator ~
        System.out.println("NOT : " +e); //operator NOT
        System.out.println("<< : "+f); //operator <<
        System.out.println(">> : "+g); //operator >>
        System.out.println("+ >>> : "+h); //operator >>>
        System.out.println("- >>> : "+j); //operator >>>
    }
}
