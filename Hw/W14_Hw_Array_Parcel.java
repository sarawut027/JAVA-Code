package Hw;

public class W14_Hw_Array_Parcel {
    public static void main(String[] args) {
        String [] parcel = {"123TH", "124EN", "125EN", "126TH", "127EN"};
        int count = 0;

        //จำนวนพัสดุทั้งหมด
        System.out.println("number of parcels " + parcel.length);
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");

        //กรองพัสดุไทย
        count = 0;
        for (String parcelth : parcel) {
            if (parcelth.endsWith("TH")) {
                count++;
            }   
        }
        System.out.println("The package is from Thailand : " + count);
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");

        //กรองพัสดุต่างประเทศ
        count = 0;
        for (String parcelen : parcel) {
            if (parcelen.endsWith("EN")) {
                count++;
            }
        }
        System.out.println("The package is from English : " + count);
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        
        int parcelall = 0;
        int parcelth = 0;
        int parceleen = 0;

        // แสดงพัสดุบอกว่ามาจากไทยหรือต่างประเทศ
        for (String parcelall1 : parcel) {
            parcelall++;
            if (parcelall1.endsWith("TH")) {
                parcelth++;
            } else if (parcelall1.endsWith("EN")) {
                parceleen++;
            }
        }
        System.out.println("The package is from all : " + parcelall);
        System.out.println("The package is from Thailand : " + parcelth);
        System.out.println("The package is from English : " + parceleen);
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
        System.out.println("Sarawut Auiyahan 027 67/44");

    }
}
