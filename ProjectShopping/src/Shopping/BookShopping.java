package Shopping;

import java.util.Scanner;

public class BookShopping {
  public static void main(String[] args) {
	  //세팅
	  Scanner scanner = new Scanner(System.in);	// 입력객체
	  //장바구니
	  BookList [] ShoppingBookBasket =  new BookList[10];
	  //책들을 담은 배열객체
	  BookList[] ShoppingBookList = new BookList[10];
	  //학생들 정보를 담는 배열객체
	  String[][] ShoppingMemberList =  new String[10][4];
	  
	  // 객체 정보넣기
	  BookList booklist1 = new BookList("1","파워자바","천인국","인피니티북스","2022년02월","35000"); 
	  BookList booklist2 = new BookList("2","혼자공부하는자바","신용권","한빛미디어","2019년12월","21600");
	  BookList booklist3 = new BookList("3","Java의정석","남궁성","도우출판","2019년12월","25000");
	  BookList booklist4 = new BookList("4","Java객체지향디자인","정인상,채응석","한빛미디어","2014년04월","28000");
	  BookList booklist5 = new BookList("5","객체지향의사실과오해","조형호","위키북스","2015년06월17일","20000");
	  BookList booklist6 = new BookList("6","오브젝트","조형호","위키북스","2019년06월17일","38000");
	  BookList booklist7 = new BookList("7","면접을위한CS전공지식","주홍철","길벗","2022년4월","24000");
	  BookList booklist8 = new BookList("8","스프링부트와AWS로혼자구현하는웹서비스","이동욱","프리렉","2019년11월29일","22000");
	  BookList booklist9 = new BookList("9","스프링부트핵심가이드","장정우","위키북스","2022년06월","25200");
	  BookList booklist10 = new BookList("10","자바웹개발워크북","구멍가게코딩단","프리렉","2022년08월24일","31500");
	  
	  // 배열에 객체(책들 정보)넣기
	  ShoppingBookList[0] = booklist1;
	  ShoppingBookList[1] = booklist2;
	  ShoppingBookList[2] = booklist3;
	  ShoppingBookList[3] = booklist4;
	  ShoppingBookList[4] = booklist5;
	  ShoppingBookList[5] = booklist6;
	  ShoppingBookList[6] = booklist7;
	  ShoppingBookList[7] = booklist8;
	  ShoppingBookList[8] = booklist9;
	  ShoppingBookList[9] = booklist10;
	  
	  
	  
	  
	//쇼핑물 추가
	  while(true) {
		  System.out.println("개발 도서 쇼핑몰에 오신것을 환영합니다.");
		  System.out.println("1.메뉴판 2.장바구니 3.로그인 4.회원가입");
		  System.out.println("가고 싶은 곳의 번호를 눌러주세요.^^");
		  int shoppingChoiceNumber = scanner.nextInt();
		  //랜딩페이지 -> 메뉴판으로 이동 
		  if(shoppingChoiceNumber ==1) {
			  System.out.println("\n");
			  System.out.println("\n");
			  System.out.println("메뉴판에 오신것을 환영합니다.^^");
			  System.out.println("\n");
			  System.out.println("❶.책이름 : Power JAVA : [3판] "
			  		+ "\n  저자 : 천인국,"
			  		+ "\n  가격 : 35,000원,"
			  		+ "\n  출판사 : 인피니티북스,"
			  		+ "\n  만든날짜 : 2022년 02월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❷.책이름 : 혼자 공부하는 자바"
			  		+ "\n  저자 : 신용권,"
			  		+ "\n  가격 : 21,600원,"
			  		+ "\n  출판사 : 한빛미디어,"
			  		+ "\n  만든날짜 :2019년 12월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❸.책이름 : Java의 정석"
			  		+ "\n  저자 : 남궁성,"
			  		+ "\n  가격 : 25,000원,"
			  		+ "\n  출판사 : 도우출판,"
			  		+ "\n  만든날짜 : 2019년 12월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❹.책이름 : JAVA 객체지향 디자인 패턴"
			  		+ "\n  저자 : 정인상,채흥석 지음,"
			  		+ "\n  가격 : 28,000원,"
			  		+ "\n  출판사 : 한빛미디어,"
			  		+ "\n  만든날짜 : 2014년 04월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❺.책이름 : 객체지향의 사실과 오해"
			  		+ "\n  저자 : 조형호,"
			  		+ "\n  가격 : 20,000원,"
			  		+ "\n  출판사 : 위키북스,"
			  		+ "\n  만든날짜 : 2015년 06월 17일");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❻.책이름 : 오브젝트"
			  		+ "\n  저자 : 조형호,"
			  		+ "\n  가격 : 38,000원,"
			  		+ "\n  출판사 : 위키북스,"
			  		+ "\n  만든날짜 : 2019년 06월 17일");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❼.책이름 : 면접을 위한 CS 전공지식 노트"
			  		+ "\n  저자 : 주홍철,"
			  		+ "\n  가격 : 24,000원,"
			  		+ "\n  출판사 : 길벗, "
			  		+ "\n  만든날짜 : 2022년 04월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❽.책이름 : 스프링 부트와 AWS로 혼자 구현하는 웹 서비스"
			  		+ "\n  저자 : 이동욱,"
			  		+ "\n  가격 : 22,000원,"
			  		+ "\n  출판사 : 프리렉,"
			  		+ "\n  만든날짜 : 2019년 11월 29일");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❾.책이름 : 스프링 부트 핵심 가이드"
			  		+ "\n  저자 : 장정우,"
			  		+ "\n  가격 : 25,200원, "
			  		+ "\n  출판사 : 위키북스, "
			  		+ "\n  만든날짜 : 2022년 06월");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("❿.책이름 : 자바 웹 개발 워크북"
			  		+ "\n  저자 : 구멍가게 코딩단,"
			  		+ "\n  가격 : 31,500원,"
			  		+ "\n  출판사 : 프리렉,"
			  		+ "\n  만든날짜 : 2022년 08월 24일");
			  System.out.println("1.장바구니에 담기 2.구매하기");
			  System.out.println("\n");
			  System.out.println("1번과 2번중에 골라주세요.");
			  System.out.println("\n");
			  int shoppingOrChoiceNumber = scanner.nextInt();
			  //메뉴판페이지에서 장바구니에 책을 담기만 할래 장바구니로 할래?
			  if(shoppingOrChoiceNumber==1) {
				  System.out.println("장바구니로 이동할 책의 번호를 눌러주세요.");
			      int BookShoppingNumber = scanner.nextInt();
			      //  구매하고싶은 책의 번호가 있냐 없냐?
			      if((BookShoppingNumber>0 && BookShoppingNumber<11)) {
			    	  //책이 있으면 장바구니에 물품 담기
			    	  System.out.println("장바구니에 담은 책들");
			    	  //책들 정보
			    	  System.out.println(ShoppingBookList[BookShoppingNumber-1].BookName);
			    	  System.out.println(ShoppingBookList[BookShoppingNumber-1].BookCost);
			    	  //장바구니에 책 넣기
			    	  for(BookList el : ShoppingBookBasket) {
			    		  if(el == null) {
			    			  el = ShoppingBookList[BookShoppingNumber-1]; 
			    			  System.out.println(el);
			    			  break; 
			    			  
			    		  }else {
			    			  continue;
			    		  }
			    	  }
			    	  System.out.println("책들이 장바구니에 담겼습니다.");
			    	  System.out.println("감사합니다.");
			    	  continue;
			      }
			      else{
			    	  // 책이 없다면 책을 다시 골라주세요.
			    	  System.out.println("책을 다시 골라주세요.");
			    	  continue;
			      }//else 끝
				  
			  }
			  //메뉴판 페이지에서 구매하기 버튼을 눌렀을때 
			  else if(shoppingOrChoiceNumber==2) {
				  System.out.println("사고싶은책의 번호를 눌러주세요.");
			      int BookShoppingNumber = scanner.nextInt();
			      //  구매하고싶은 책의 번호가 있냐 없냐?
			      if(BookShoppingNumber>0 && BookShoppingNumber<11) {
			      	   //장바구니에 책들을 넣을거다.
			    	  System.out.println("--------------장바구니페이지--------------");
			    	  for(BookList el : ShoppingBookBasket) {
						  if(el !=null) {
							  System.out.println(el.BookName);
							  System.out.println(el.BookCost);
							  System.out.println("책들이 장바구니에 담겼습니다.");
							  System.out.println("감사합니다.");
							  
						  }
					  }
					  System.out.println("책들의 가격");
					  System.out.println("1.구매하기 2.수정하기 3.돌아가기");
			    	  
			      }else{
			    	  System.out.println("책을 다시 골라주세요.");
			    	  continue;
			      }//else 끝
			  }// 메뉴판 페이지에서 구매하기버튼이 끝났을때
			  
		  }
		  //랜딩페이지 -> 장바구니페이지 이동
		  else if(shoppingChoiceNumber ==2) {
			  System.out.println("--------------장바구니페이지--------------");
	    	  //책들 정보
			  for(BookList el : ShoppingBookBasket) {
				  System.out.println(el);
			  }
			  for(BookList el : ShoppingBookBasket) {
				  if(el !=null) {
					  System.out.println(el);
					  System.out.println("책들이 장바구니에 담겼습니다.");
					  System.out.println("감사합니다.");
					  
				  }
			  }
			  System.out.println("책들의 가격");
			  System.out.println("1.구매하기 2.수정하기 3.돌아가기");
		  }
		  //랜딩페이지 -> 로그인페이지 이동
		  else if(shoppingChoiceNumber ==3) {
			  
		  }
		  //랜딩페이지 -> 회원가입페이지 이동
		  else if(shoppingChoiceNumber ==4) {
			  
		  }
		  //그런페이지는 없습니다.
		  else {continue;}
		  //끝
	  }
	
}
}
