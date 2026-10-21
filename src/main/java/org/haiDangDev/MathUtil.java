package org.haiDangDev;

public class MathUtil {
    public static long getFactorial(int n) {
//        // thuat toan tinh n! = 1,2,3,4...n, n tu 0..20
//        if(n<0||n>20){
//            throw new IllegalArgumentException("Invaled parameter. n must be between 0 and 20");
//        }
//        if(n == 0){
//            return 1; //n = 0 return ngay
//        }
//        // sure n tu 1..20
//        long result = 1; // khoi dau giai thua bang 1, nhan don
//                          // code co tinh tao bug
//        //sua lai source de mlem tro lai green 4 ever
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        // Refectoring, refactor: tối ưu, tinh chỉnh source code
        // Code mới khi được đưa lên server, phải đc check lại ngay ở nhánh dev, hoặc khi đưa vào nhánh main
        // thì cx phải đc check để đảm bảo rằng nó màu xanh, passed
        //            throw new IllegalArgumentException("Invaled parameter. n must be between 0 and 20");
        //        }
        //        if(n == 0){
        //            return 1; //n = 0 return ngay lý do : hàm thì phải chạy đúng!!!!!
        // nếu project có sẵn tđ, unit test, thì quá trình kiểm thử lại code vừa sửa diễn ra rất nhanh, rất tiện
        //RẤT NHANH, RẤT TIỆN DO UNIT TEST KHI PHỐI HỢP VỚI CI SCRIPT (.YAML) SẼ TỰ ĐỘNG ĐC RUN VÀ TỰ BÁO MÀU XANH ĐỎ VÀ GỬI EMAIL CHỬI NẾU CÓ ĐỎ!!!
        // TEST LAI THỨ ĐÃ TỪNG TEST ĐỂ CHẮC CHẮN RẰNG NÓ VẪN CÒN ỔN SAU KHI ĐC SỬA ĐC GOI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
        // ta   code dung de quy - recuision
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invaled parameter. n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1; //n = 0 return ngay
        }
        return n * getFactorial(n - 1);
    }
}
