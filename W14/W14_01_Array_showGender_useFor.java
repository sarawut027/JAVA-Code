//  คำตอบที่ต้องการ
//  1) มีจำนวนนักเรียนทั้งหมดกี่คน
//  2) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" และมีจำนวนนักเรียนเท่ากับกี่คน
//  3) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" และมีจำนวนนักเรียนเท่ากับกี่คน
//  4) แสดงชื่อนักเรียนทั้งหมด และแสดงเพศของนักเรียนแต่ละคน
//  5) แสดงลำดับของนักเรียนแต่ละคน
        // มีจำนวนนักเรียนเท่ากับกี่คน
        // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
        // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
//  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        // มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        // มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
        // มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่

        package W14;

        public class W14_01_Array_showGender_useFor {
            public static void main(String[] args) {
                // สร้าง Array ชื่อ name เพื่อเก็บชื่อนักเรียน จำนวน 5 คน
                String [] name = {"Mr.somchai","Ms.somsri","Msr.somjai","Mr.somdee","Ms.somruethai"};
                String [] codes = {"123TH","124EN","125EN","126TH","127EN"};
        
                // 1) แสดงจำนวนนักเรียนทั้งหมด
                System.out.println("Total number of students " + name.length);
                System.out.println("====================================");
                
                // 2) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [startsWith()] และมีจำนวนนักเรียนเท่ากับกี่คน
                // แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย"
                // และมีจำนวนนักเรียนเท่ากับกี่คน
                System.out.println("The student's name begins with the word 'Mr.'");
                int count = 0;
                for (int i = 0 ; i < name.length ; i++){
                    if (name[i].startsWith("Mr.")){
                        System.out.println(name[i]);
                        count++;
                    }
                }
                System.out.println("The number of students starts with Mr. " + count);
                //System.out.println(name[0]);
                //System.out.println(name[3]);
                System.out.println("====================================");

                //  3) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" 
                // และมีจำนวนนักเรียนเท่ากับกี่คน
                System.out.println("the student's name begins with the word 'Ms'");
                count = 0;
                for (int j=0;j<name.length;j++){
                    if (name[j].startsWith("Ms"+"mrs")){
                        System.out.println(name[j]);
                        count++;
                    }
                }
                System.out.println("The number of students starts with Ms " + count);
                System.out.println("====================================");
    
                // 4) แสดงชื่อนักเรียนทั้งหมด และแสดงเพศของนักเรียนแต่ละคน
                        // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" ให้แสดงว่าเป็นเพศชาย
                        // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" ให้แสดงว่าเป็นเพศหญิง
                        // มีจำนวนนักเรียนเท่ากับกี่คน
                count = 0;
                for (int i = 0 ; i < name.length ; i++){
                    if (name[i].startsWith("Mr.")){
                        System.out.println(name[i] + " is male");
                        count++;
                    }
                    else if (name[i].startsWith("Ms")){
                        System.out.println(name[i] + " is female");
                        count++;
                    }
                }
                System.out.println("The number of students is " + count);
           
                System.out.println("====================================");
    
                // 5) แสดงเลขลำดับของนักเรียนแต่ละคน 
                        // มีจำนวนนักเรียนเท่ากับกี่คน
                        // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
                        // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
                        // มีจำนวนนักเรียนเท่ากับกี่คน
                        // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
                        // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
                int countAll = 0;
                int countMale = 0;
                for (int i = 0 ;i < name.length ; i++){
                    if (name[i].startsWith("Mr.")){
                        System.out.println((i+1)+". " + name[i] + " is male");
                        countAll++;
                        countMale++;
                }else{
                    System.out.println((i+1)+". "+name[i]+ " is famale");
                    countAll++;
                }
            }
                System.out.println("The number of students is " + countAll);
                System.out.println("The number of male students is " + countMale);
                System.out.println("The number of female students is " + (countAll - countMale));
                System.out.println("====================================");
    }
 }
        