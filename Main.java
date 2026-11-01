import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("您想进行什么操作？");
    System.out.println(
        "1.加法 2.减法 3.乘法 4.除法 5.模运算 6.取正弦值 7.取余弦值 8.取正切值 9.取对数 10.解一元一次方程. 11.解一元二次方程 12.求方差 13.求平均值");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    double result = 0;
    double result1 = 0;
    double[] data = new double[1000];
    double temp = 0;
    switch (choice) {
      case 1:
        System.out.print("请输入两个数：");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        result = a1 + b1;
        System.out.println("结果：" + result);
        break;
      case 2:
        System.out.print("请输入两个数：");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        result = a2 - b2;
        System.out.println("结果：" + result);
        break;
      case 3:
        System.out.print("请输入两个数：");
        double a3 = scanner.nextDouble();
        double b3 = scanner.nextDouble();
        result = a3 * b3;
        System.out.println("结果：" + result);
        break;
      case 4:
        System.out.print("请输入两个数：");
        double a4 = scanner.nextDouble();
        double b4 = scanner.nextDouble();
        if (b4 != 0) {
          result = a4 / b4;
          System.out.println("结果：" + result);
        } else {
          System.out.println("除数不能为0");
        }
        break;
      case 5:
        System.out.print("请输入两个数：");
        double a5 = scanner.nextDouble();
        double b5 = scanner.nextDouble();
        if (b5 != 0) {
          result = a5 % b5;
          System.out.println("结果：" + result);
        } else {
          System.out.println("模数不能为0");
        }
        break;
      case 6:
        System.out.print("请输入一个角度（弧度）：");
        double angle1 = scanner.nextDouble();
        result = Math.sin(angle1);
        System.out.println("结果：" + result);
        break;
      case 7:
        System.out.println("输入一个角度（弧度）：");
        double angel2 = scanner.nextDouble();
        result = Math.cos(angel2);
        System.out.println("结果：" + result);
        break;
      case 8:
        System.out.println("输入一个角度（弧度）：");
        double angel3 = scanner.nextDouble();
        result = Math.tan(angel3);
        System.out.println("结果：" + result);
        break;
      case 9:
        System.out.println("请输入两个数（第一个数为底数）：");
        double a6 = scanner.nextDouble();
        double b6 = scanner.nextDouble();
        result = Math.log(b6) / Math.log(a6);
        System.out.println("结果：" + result);
        break;
      case 10:
        System.out.println("请输入一元一次方程中的所有参数（包括等号后面的结果）：");
        double a7 = scanner.nextDouble();
        double b7 = scanner.nextDouble();
        double c7 = scanner.nextDouble();
        if (a7 != 0) {
          result = (c7 - b7) / a7;
          System.out.println("结果：" + result);
        } else {
          System.out.println("系数a不能为0");
        }
        break;
      case 11:
        System.out.println("请输入一元二次方程中的所有参数（包括等号后面的结果）：");
        double a8 = scanner.nextDouble();
        double b8 = scanner.nextDouble();
        double c8 = scanner.nextDouble();
        double d8 = scanner.nextDouble();
        if (a8 != 0) {
          double dx = b8 * b8 - 4 * a8 * (c8 - d8);
          if (dx >= 0) {
            result = (-b8 + Math.sqrt(dx)) / (2 * a8);
            result1 = (-b8 - Math.sqrt(dx)) / (2 * a8);
            if (result == result1) System.out.println("结果：" + result);
            else System.out.println("结果：" + result + "或" + result1);
          } else {
            double real = -b8 / (2 * a8);
            double imag = Math.sqrt(-dx) / (2 * a8);
            System.out.println("结果：" + real + "+" + imag + "i" + "或" + real + "-" + imag + "i");
          }
        } else {
          System.out.println("系数a不能为0");
        }
        break;
      case 12:
        System.out.println("请输入一串数据：(输入0结束输入)");
        int n = 0;
        while (true) {
          temp = scanner.nextDouble();
          if (temp != 0) {
            data[n] = temp;
            n++;
          } else break;
        }
        if (n > 0) {
          double sum = 0;
          for (int k = 0; k < n; k++) {
            sum += data[k];
          }
          double avg = sum / n;
          double variance = 0;
          for (int k = 0; k < n; k++) {
            variance += (data[k] - avg) * (data[k] - avg);
          }
          variance /= n;
          System.out.println("方差是：" + variance);
        } else {
          System.out.println("没有数据");
        }
        break;
      case 13:
        System.out.println("请输入一串数据：(输入0结束输入)");
        int n2 = 0;
        while (true) {
          temp = scanner.nextDouble();
          if (temp != 0) {
            data[n2] = temp;
            n2++;
          } else break;
        }
        if (n2 > 0) {
          double sum = 0;
          for (int k = 0; k < n2; k++) {
            sum += data[k];
          }
          double avg = sum / n2;
          System.out.println("平均值是：" + avg);
        } else {
          System.out.println("没有数据");
        }
        break;
      default:
        System.out.println("无效选项");
    }
    scanner.close();
  }
}
