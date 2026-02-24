package edu.adse2501.sess09_java_data_structures;

import java.util.BitSet;

/**
* This program demonstrates the usage of the BitSet class in Java.
* BitSet is a class that allows the creation of a sequence of bits, 
* which can grow as needed. It is particularly efficient for manipulating
* large sets of bits for tasks such as checking flags or storing binary states.
* 
* Methods demonstrated include setting, clearing, flipping, and performing 
* logical operations (AND, OR) on bits.
* 
 * @author todoi
 */
public class BitsetDemo
{
    public static void main(String[] args)
    {
        // Create a Bitset instance/object of size 8
        BitSet bitSet1 = new BitSet(8);
        BitSet bitSet2 = new BitSet(8);
        
        //Set some bits in bitset1
        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);
        bitSet1.set(6);
        
        //Set some bits in bitset2
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        bitSet2.set(4);
        
        // Display the initial bitSets
        System.out.println("Initial bitSte1: " + bitSet1);
        System.out.println("-".repeat(45));
        System.out.println("Initial bitSte2: " + bitSet2);
        
        //perform logical AND operation b/n bitSet1 & bitSet2
        BitSet andResult = (BitSet) bitSet1.clone();//clone bitSet1 to preserve the original
        andResult.and(bitSet2);//AND operation
        System.out.println("\nbitSet1 AND bitSet2: " + andResult);
        
        //perform logical OR operation b/n bitSet1 & bitSet2
        BitSet orResult = (BitSet) bitSet1.clone();//clone bitSet1 to preserve the original
        orResult.and(bitSet2);//OR operation
        System.out.println("\nbitSet1 OR bitSet2: " + orResult);
        
        //perform logical XOR operation b/n bitSet1 & bitSet2
        BitSet xorResult = (BitSet) bitSet1.clone();//clone bitSet1 to preserve the original
        xorResult.and(bitSet2);//XOR operation
        System.out.println("\nbitSet1 XOR bitSet2: " + xorResult);
        
        //Flip(invert) th bits in bitSet1
        BitSet flippedBitSet1 = (BitSet) bitSet1.clone();
        flippedBitSet1.flip(0,8);//flip all bits from index 0 to 8
        System.out.println("\nFlipped bitSet1: " + flippedBitSet1);
        
        //Clear a specific bit in bitSet2
        BitSet clearedBitSet2 = (BitSet) bitSet2.clone();
        clearedBitSet2.clear(2);//clear the bit at index 2
        System.out.println("bitSet2 after clearing bit 2: " + clearedBitSet2);
        
        //check if specific bit is set in bitset1
        System.out.println("\nIs a bit at index 4 set in bitSet1? " + bitSet1.get(4));
        System.out.println("Is a bit at index 5 set in bitSet1? " + bitSet1.get(5));
    }
}
