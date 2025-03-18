public class ChuaBai1 {
    public static void main(String[] args) {
        String data="Tôi học lập trình, học lập trình rất hay";
        data= data.replaceAll(",", "");
        String[] arr=data.split(" ");


        for(int i=0;i<arr.length;i++){
            String chuoiCanDem = arr[i];
            int demSoLanXuatHien=0;
            boolean daKiemTra=false;
            for(int j=0;j< i;j++){
                String chuoiDaDuocKiemTra = arr[j];
                if(chuoiCanDem.equalsIgnoreCase(chuoiDaDuocKiemTra)){
                    daKiemTra=true;
                    break;
                }
            }
            if(daKiemTra){
                continue;
            }
            else{
                demSoLanXuatHien++;
            }
            System.out.println("Chuoi: "+chuoiCanDem+" Xuat hien: "+demSoLanXuatHien);
        }
    }
}
