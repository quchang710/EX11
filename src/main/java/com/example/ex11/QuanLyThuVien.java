import com.example.ex11.Sach;
import com.example.ex11.ThuVien;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class QuanLyThuVien extends Application {
    private ThuVien thuVien = new ThuVien("1", "Thu Vien Trung Tam");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quan Ly Thu Vien");

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 10;");

        Label labelTitle = new Label("Chương Trình Quản Lý Thư Viện");

        Button btnThemSach = new Button("Thêm Sách Mới");
        Button btnXoaSach = new Button("Xóa Sách");
        Button btnTimKiem = new Button("Tìm Kiếm Sách");
        Button btnHienThi = new Button("Hiển Thị Danh Sách Sách");

        btnThemSach.setOnAction(e -> {
            thuVien.themSach(new Sach("S001", "Java Programming", "John Doe", "Lap trinh", 2022, "San sang"));
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Đã thêm sách mới!");
            alert.show();
        });

        btnHienThi.setOnAction(e -> {
            thuVien.hienThiDanhSachSach();
        });

        root.getChildren().addAll(labelTitle, btnThemSach, btnXoaSach, btnTimKiem, btnHienThi);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
