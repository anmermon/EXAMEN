/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexer;

/**
 *
 * @author Andre
 */
public class Real extends Token {
    public final float value;
    public Real(float v){ super(Tag.REAL); value = v;}
    public String toString(){return "" + value;}   
}
