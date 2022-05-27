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
public class Set extends Stmt {
    public Id id; public Expr expr;
    public Set(Id i, Expr x){
        id = i; expr = x;
        if(check(id.type, expr.type) == null) error("error de tipo");
    }
    public Type check(Type p1, Type p2){
        if(Type.numeric(p1) && Type.numeric(p2)) return p2;
        else if(p1 == Type.Bool && p2 == Type.Bool) return p2;
        else return null;
    }
    public void gen(int b, int a){
        emit(id.toString() + " = " + expr.gen().toString() );
    }   
}
