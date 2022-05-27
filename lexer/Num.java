/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexer;

/**
 *
 * @author Andre
 */
public class Num extends Token{
    public final int value; 
    public Num(int v) {super(Tag.NUM); value = v;}
    public String toString(){return "" + value;}    
}
