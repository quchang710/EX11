package com.example.ex11;

public class Sach {
        private String id;
        private String tieuDe;
        private String tacGia;
        private String theLoai;
        private int namXuatBan;
        private String trangThai; // "Dang muon" hoặc "San sang"

        public Sach(String id, String tieuDe, String tacGia, String theLoai, int namXuatBan, String trangThai) {
            this.id = id;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
            this.theLoai = theLoai;
            this.namXuatBan = namXuatBan;
            this.trangThai = trangThai;
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getTieuDe() { return tieuDe; }
        public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

        public String getTacGia() { return tacGia; }
        public void setTacGia(String tacGia) { this.tacGia = tacGia; }

        public String getTheLoai() { return theLoai; }
        public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

        public int getNamXuatBan() { return namXuatBan; }
        public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

        public String getTrangThai() { return trangThai; }
        public void setTrangThai(String trangThai) { this.trangThai = trangThai; }

        @Override
        public String toString() {
            return "com.example.ex11.Sach [ID=" + id + ", Tieu de=" + tieuDe + ", Tac gia=" + tacGia + ", The loai=" + theLoai +
                    ", Nam XB=" + namXuatBan + ", Trang thai=" + trangThai + "]";
        }
    }


