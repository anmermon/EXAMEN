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
public class Unary extends Op{
    public Expr expr;
    public Unary (Token tok, Expr x){
        super (tok, null); expr = x;
        type = Type.max(Type.Int, expr.type);
        if (type == null) error("error de tipo");
    }
    public Expr gen(){return new Unary (op, expr.reduce());}
    public String toString(){return op.toString()+" "+expr.toString();}
    
}
