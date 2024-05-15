package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_Soru extends JDBCParent{
    // city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız

    // rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
    //rs.getRow();şu anda kaçıncı satırda olduğunun bilgisini verir

    @Test
    public void Test1() throws SQLException {

        DBConnectionOpen();

       ResultSet rs= sorguEkrani.executeQuery("select city from city");
       rs.last();
       int sonSatirNo=rs.getRow(); // son satır numarası

        for (int i = 1; i <=sonSatirNo ; i++) {
            rs.absolute(i);
            System.out.println(i+".satır:" + rs.getString(1));
        }

        DBConnectionClose();
    }

    //city tablosundaki tüm satırlardaki şehir isimlerini relative ise yazdırınız

    // rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.

    @Test
    public void Test2() throws SQLException{
        DBConnectionOpen();

        ResultSet rs= sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSatirNo=rs.getRow(); // son satır numarası

        rs.first(); //başa almamız gerek
        System.out.println("1. satır : " + rs.getString(1));

        for (int i = 1; i <=sonSatirNo ; i++) {
            rs.relative(1);
            System.out.println(i+".satır:" + rs.getString(1));
        }

        DBConnectionClose();
    }

}
