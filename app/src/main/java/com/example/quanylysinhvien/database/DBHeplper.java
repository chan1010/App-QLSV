package com.example.quanylysinhvien.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.quanylysinhvien.R;
import com.example.quanylysinhvien.model.SinhVien;

import java.util.ArrayList;

public class DBHeplper extends SQLiteOpenHelper {
    public DBHeplper(@Nullable Context context) {
        super(context, "QUANLYSINHVIENFPTDB.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String sql = " CREATE TABLE LOP(maLop TEXT PRIMARY KEY, tenLop TEXT)";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('LTAndroid','Lap Trinh Android')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('LTPHP','Lap Trinh PHP')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('LTC++','Lap Trinh C#')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('LTUD','Lap Trinh Ứng dụng ')";
        db.execSQL(sql);

        sql = " CREATE TABLE SINHVIEN(maSv TEXT PRIMARY KEY, tenSV TEXT ," + " email TEXT ,hinh TEXT, maLop TEXT REFERENCES LOP(maLop))";
        db.execSQL(sql);
     sql = " INSERT INTO SINHVIEN VALUES ('001','Đặng Gia Lộc','Gialoc@gmail.com','avatamacdinh','LTC++')";
      db.execSQL(sql);
       sql = " INSERT INTO SINHVIEN VALUES ('002','Lê Trúc Đào','reventro@gmail.com','avatamacdinh','LTAndroid')";
     db.execSQL(sql);
      sql = " INSERT INTO SINHVIEN VALUES ('003','Phạm Thị Huyền Trang','Trangpham596@gmail.com','avatamacdinh','LT java')";
       db.execSQL(sql);
       sql = " INSERT INTO SINHVIEN VALUES ('004','Võ Nguyễn Xuân Hào','XuanHao123@gmail.com','avatamacdinh','LTC++')";
      db.execSQL(sql);
       sql = " INSERT INTO SINHVIEN VALUES ('005','Nguyễn Văn Thuận','vanthuan@gmail.com','avatamacdinh','LTAndroid')";
       db.execSQL(sql);
       sql = " INSERT INTO SINHVIEN VALUES ('006','Phan Thị Kim Thư','kimthu03151@gmail.com','avatamacdinh','LT java')";
      db.execSQL(sql);
       sql = " INSERT INTO SINHVIEN VALUES ('007','Phùng Thị Minh ','minhtam151@gmail.com','avatamacdinh','LT java')";
       db.execSQL(sql);
        sql = "CREATE TABLE taiKhoan(tenTaiKhoan text primary key, matKhau text)";
        db.execSQL(sql);
      sql = "INSERT INTO taiKhoan VALUES('admin','admin')";
        db.execSQL(sql);
       sql = "INSERT INTO taiKhoan VALUES('admin1','admin1')";
        db.execSQL(sql);
       sql = "INSERT INTO taiKhoan VALUES('admin2','admin1')";
       db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
