package com.lt.testt;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class BeanCopyTest
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("a");
        student.setAge("12");
        student.setAddress("123");
        student.setSex("Nan");
        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();
        long before = System.currentTimeMillis();
        org.springframework.beans.BeanUtils.copyProperties(student, teacher);
        System.out.println(System.currentTimeMillis() - before);
        System.out.println(teacher);
        long before2 = System.currentTimeMillis();
        try
        {
            BeanUtils.copyProperties(student, teacher2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - before2);
    }
}

class Student
{
    private String name;

    private String age;

    private String sex;

    private String address;

    private String a;

    private String b;

    private String c;

    private String cd;

    private String e;

    private String f;

    private String g;

    private String h;

    private String i;

    private String j;

    private String k;

    private String o;

    private String p;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getA()
    {
        return a;
    }

    public void setA(String a)
    {
        this.a = a;
    }

    public String getB()
    {
        return b;
    }

    public void setB(String b)
    {
        this.b = b;
    }

    public String getC()
    {
        return c;
    }

    public void setC(String c)
    {
        this.c = c;
    }

    public String getCd()
    {
        return cd;
    }

    public void setCd(String cd)
    {
        this.cd = cd;
    }

    public String getE()
    {
        return e;
    }

    public void setE(String e)
    {
        this.e = e;
    }

    public String getF()
    {
        return f;
    }

    public void setF(String f)
    {
        this.f = f;
    }

    public String getG()
    {
        return g;
    }

    public void setG(String g)
    {
        this.g = g;
    }

    public String getH()
    {
        return h;
    }

    public void setH(String h)
    {
        this.h = h;
    }

    public String getI()
    {
        return i;
    }

    public void setI(String i)
    {
        this.i = i;
    }

    public String getJ()
    {
        return j;
    }

    public void setJ(String j)
    {
        this.j = j;
    }

    public String getK()
    {
        return k;
    }

    public void setK(String k)
    {
        this.k = k;
    }

    public String getO()
    {
        return o;
    }

    public void setO(String o)
    {
        this.o = o;
    }

    public String getP()
    {
        return p;
    }

    public void setP(String p)
    {
        this.p = p;
    }

    @Override
    public String toString()
    {
        return "Student{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", sex='" + sex + '\'' +
            ", address='" + address + '\'' +
            ", a='" + a + '\'' +
            ", b='" + b + '\'' +
            ", c='" + c + '\'' +
            ", cd='" + cd + '\'' +
            ", e='" + e + '\'' +
            ", f='" + f + '\'' +
            ", g='" + g + '\'' +
            ", h='" + h + '\'' +
            ", i='" + i + '\'' +
            ", j='" + j + '\'' +
            ", k='" + k + '\'' +
            ", o='" + o + '\'' +
            ", p='" + p + '\'' +
            '}';
    }
}

class Teacher
{
    private String name;

    private String age;

    private String sex;

    private String address;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Teacher{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", sex='" + sex + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
