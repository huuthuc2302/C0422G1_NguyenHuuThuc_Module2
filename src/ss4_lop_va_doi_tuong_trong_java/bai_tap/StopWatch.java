package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Date;

//Xây dựng lớp StopWatch
public class StopWatch {
    private Date startTime, endTime; //Trường startTime và endTime là private
    public StopWatch (){

    }
//    public StopWatch ( Date startTime, Date endTime){
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    //Phương thức start() để reset startTime về thời gian hiện tại của hệ thống
    public void start(){
        this.startTime = new Date();
    }
    //Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống
    public  void stop(){
        this.endTime = new Date();
    }
    //Phương thức getElapsedTime() trả về thời gian đã trôi qua
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch(); //khởi tạo
        stopWatch.start();
        long sum = 0;
        for (long i = -1000000; i < 1000000; i++){
            sum += i;
        }
        stopWatch.stop();
        System.out.println("thời gian là " + stopWatch.getElapsedTime());
    }
}

