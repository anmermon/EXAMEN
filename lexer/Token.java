/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexer;

/**
 *
 * @author Andre
 */
public class Token {
    public final int tag;
    public Token (int t) {tag = t;}
    public String toString() {return "" + (char)tag;} 
}
