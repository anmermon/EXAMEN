/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import lexer.*;
import symbols.*;
/**
 *
 * @author Andre
 */
public class Temp extends Expr{
    static int count = 0;
    int number = 0;
    public Temp(Type p){ super(Word.temp, p); number = ++count;}
    public String toString(){return "t" + number;}    
}
