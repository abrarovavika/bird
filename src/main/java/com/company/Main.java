package com.company;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Main extends GraphicsProgram {
    public void mousePressed(MouseEvent e){
        Color k= new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
      /*  GOval oval = new GOval(50,50);
        oval.setLocation(e.getX()-25,e.getY()-25);
        oval.setFilled(true);
        oval.setFillColor(k);
        oval.setColor(k);
        add(oval);
        GRect a = new GRect(132,150);
        a.setLocation(e.getX()-65,e.getY()-100);
        a.setFilled(true);
        a.setFillColor(k);
        a.setColor(k);
        add(a);
        GOval b = new GOval(132,120);
        b.setLocation(e.getX()-65,e.getY()-150);
        b.setFilled(true);
        b.setFillColor(k);
        b.setColor(k);
        add(b);
        GOval c = new GOval(44,44);
        c.setLocation(e.getX()+22,e.getY()+22);
        c.setFilled(true);
        c.setFillColor(k);
        c.setColor(k);
        add(c);
        GOval d = new GOval(44,44);
        d.setLocation(e.getX()-22,e.getY()+22);
        d.setFilled(true);
        d.setFillColor(k);
        d.setColor(k);
        add(d);
        GOval r = new GOval(44,44);
        r.setLocation(e.getX()-66,e.getY()+22);
        r.setFilled(true);
        r.setFillColor(k);
        r.setColor(k);
        add(r);
        GOval f = new GOval(30,30);
        f.setLocation(e.getX()+22,e.getY()-100);
        f.setFilled(true);
        f.setFillColor(Color.black);
        f.setColor(Color.black);
        add(f);
        GOval g = new GOval(30,30);
        g.setLocation(e.getX()-50,e.getY()-100);
        g.setFilled(true);
        g.setFillColor(Color.black);
        g.setColor(Color.black);
        add(g);*/
    }
    public void run(){
        addMouseListeners();
        int X=getWidth();
        int Y =getHeight();
        int vx =5;
        int vy =5;
        GOval a = new GOval(200,200);
        a.setLocation(X/2-80,Y/2-150);
        a.setFilled(true);
        a.setFillColor(Color.black);
        a.setColor(Color.black);
        add(a);
        GRect c = new GRect(10,100);
        c.setLocation(X/2-10,Y/2+10);
        c.setFilled(true);
        c.setFillColor(Color.black);
        c.setColor(Color.black);
        add(c);
        GRect d = new GRect(10,100);
        d.setLocation(X/2+50,Y/2+10);
        d.setFilled(true);
        d.setFillColor(Color.black);
        d.setColor(Color.black);
        add(d);
        GRect e = new GRect(20,50);
        e.setLocation(X/2+40,Y/2+100);
        e.setFilled(true);
        e.setFillColor(Color.red);
        e.setColor(Color.red);
        add(e);
        GRect f = new GRect(20,50);
        f.setLocation(X/2-20,Y/2+100);
        f.setFilled(true);
        f.setFillColor(Color.red);
        f.setColor(Color.red);
        add(f);
        GRect g = new GRect(100,10);
        g.setLocation(X/2-120,Y/2-50);
        g.setFilled(true);
        g.setFillColor(Color.yellow);
        g.setColor(Color.yellow);
        add(g);
        GOval j = new GOval(20,20);
        j.setLocation(X/2-50,Y/2-100);
        j.setFilled(true);
        j.setFillColor(Color.white);
        j.setColor(Color.white);
        add(j);
        GOval l = new GOval(20,20);
        l.setLocation(X/2+50,Y/2-50);
        l.setFilled(true);
        l.setFillColor(Color.white);
        l.setColor(Color.white);
        add(l);
        GRect m = new GRect(40,20);
        m.setLocation(X/2+20,Y/2+150);
        m.setFilled(true);
        m.setFillColor(Color.red);
        m.setColor(Color.red);
        add(m);
        GRect n = new GRect(40,20);
        n.setLocation(X/2-40,Y/2+150);
        n.setFilled(true);
        n.setFillColor(Color.red);
        n.setColor(Color.red);
        add(n);
        while(true){
            pause(1000/48);
            a.move(vx,vy);
            d.move(vx,vy);
            c.move(vx,vy);
            e.move(vx,vy);
            f.move(vx,vy);
            g.move(vx,vy);
            l.move(vx,vy);
            j.move(vx,vy);
            n.move(vx,vy);
            m.move(vx,vy);
            if(a.getY()<0){
                vy=vy*(-1);
            }
            if (n.getY()>Y-20){
                vy=vy*(-1);
            }
            if (a.getX()>X-200){
                vx=vx*(-1);
            }
            if (g.getX()<0){
                vx=vx*(-1);
            }
        }
    }

    public static void main(String[] args) {
new Main().start();
    }
}
