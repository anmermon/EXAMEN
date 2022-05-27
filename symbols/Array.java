/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symbols;
import lexer.*;
/**
 *
 * @author Andre
 */
public class Array extends Type{
    public Type of;
    public int size = 1;
    public Array(int sz, Type p){
        super("[]", Tag.INDEX, sz*p.width); size =sz; of = p;
    }
    public String toString(){return "[" + size + "]" + of.toString();}    
}
