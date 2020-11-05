package com.thirdhomework.aefottt;

import java.util.Scanner;

public class ThirdHomework {
    //计算器类的实现
    public static class Calculator implements Calculate{
        @Override
        public double calculate(double x, String operate, double y) {
            return switch (operate){
                case "+" -> x + y;
                case "-" -> x - y;
                case "*","x","X" -> x * y;
                case "/" -> x / y;
                default -> -1;
            };
        }
    }

    public static void main(String[] args) {
//        level2();
        level3();
    }

    public static void level3(){
        Users taojie = new Taojie();
        Shops jd = new JD();
        //涛姐看中了一款电脑并付首款
        Goods computer = new Goods("外星人X",99999);
        //京东收到了涛姐的订单并立刻开始配送
        taojie.buyGoods(jd, computer);
        //涛姐在家里等的好着急，每天都要查看一遍订单
        taojie.searchProgress(jd, computer);
        //几天后，涛姐心动的电脑终于到啦！！！
        jd.inform(taojie,computer);
        //涛姐欢快地去取了他的电脑，并开始了漫长且艰辛的安卓开发之旅
    }

    //level2作业 ---计算器的实现
    public static void level2(){
        boolean flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数");
            while(!sc.hasNextDouble()){
                System.out.println("请输入正确的数字！");
                sc = new Scanner(System.in);
            }
            double x = sc.nextDouble();
            System.out.println("请输入运算符：");
            sc = new Scanner(System.in);
            String operate = sc.nextLine();
            while(!("+".equals(operate)||"-".equals(operate)||"*".equals(operate)||"x".equals(operate)||"X".equals(operate)||"/".equals(operate))){
                System.out.println("请输入正确的运算符！");
                sc = new Scanner(System.in);
                operate = sc.nextLine();
            }
            System.out.println("请输入第二个数");
            while(!sc.hasNextDouble()){
                System.out.println("请输入正确的数字！");
                sc = new Scanner(System.in);
            }
            double y = sc.nextDouble();
            Calculator ca = new Calculator();
            double result = ca.calculate(x,operate,y);
            if(result!=-1) System.out.println(x+operate+y+"="+result);
            else System.out.println("Warning:计算出错！");

            System.out.println("是否要继续计算？（输入1继续计算，输入2结束计算）");
            sc = new Scanner(System.in);
            while(!sc.hasNextInt()){
                System.out.println("请输入正确的选择数字！");
                sc = new Scanner(System.in);
            }
            int isContinue = sc.nextInt();
            while(isContinue!=1&&isContinue!=2){
                System.out.println("请输入正确的选择数字！");
                sc = new Scanner(System.in);
                isContinue = sc.nextInt();
            }
            if(isContinue==2) flag = false;
        }
    }
}
