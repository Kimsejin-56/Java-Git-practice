package javastart.arr.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int productCount=0;
        String [] productNames;
        int[] productPrices;
        productNames=new String[10];
        productPrices=new int[10];
        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        while(true){
            System.out.print("메뉴를 선택하세요:");
            int num=scanner.nextInt();
            scanner.nextLine();
            if(num==1){
                if (productCount >= 10) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                }
                System.out.print("상품을 이름을 입력하세요:");
                String goods=scanner.nextLine();
                System.out.print("상품을 가격을 입력하세요:");
                int price=scanner.nextInt();
                productNames[productCount]=goods;
                productPrices[productCount]=price;
                productCount++;
            }else if(num==2){
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                for(int i=0;i<productCount;i++){
                    System.out.println(productNames[i]+": "+productPrices[i]);
                }
            }else if(num==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
