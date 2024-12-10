package com.example.ex11;

import java.util.ArrayList;

    public class ThuVien {
        // Thuộc tính
        private String id;
        private String tenThuVien;
        private ArrayList<Sach> danhSachSach;

        // Constructor
        public ThuVien(String id, String tenThuVien) {
            this.id = id;
            this.tenThuVien = tenThuVien;
            this.danhSachSach = new ArrayList<>();
        }

        public String getId() { return id; }
        public String getTenThuVien() { return tenThuVien; }

        public void themSach(Sach sach) {
            danhSachSach.add(sach);
        }

        public void xoaSach(String idSach) {
            danhSachSach.removeIf(s -> s.getId().equals(idSach));
        }

        public ArrayList<Sach> timKiemSach(String tuKhoa) {
            ArrayList<Sach> ketQua = new ArrayList<>();
            for (Sach sach : danhSachSach) {
                if (sach.getTieuDe().contains(tuKhoa) || sach.getTacGia().contains(tuKhoa)) {
                    ketQua.add(sach);
                }
            }
            return ketQua;
        }

        public void hienThiDanhSachSach() {
            System.out.println("Danh sach sach trong thu vien " + tenThuVien + ":");
            for (Sach sach : danhSachSach) {
                System.out.println(sach);
            }
        }

        @Override
        public String toString() {
            return "com.example.ex11.ThuVien [ID=" + id + ", Ten thu vien=" + tenThuVien + ", Tong so sach=" + danhSachSach.size() + "]";
        }
    }


