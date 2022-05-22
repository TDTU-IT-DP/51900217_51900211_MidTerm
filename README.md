

TỔNG LIÊN ĐOÀN LAO ĐỘNG VIỆT NAM** 

**TRƯỜNG ĐẠI HỌC TÔN ĐỨC THẮNG** 

**KHOA CÔNG NGHỆ THÔNG TIN** 


![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.001.png)



**Tạo chương trình terminal Java tính giá tiền một chiếc xe ô tô đi kèm với phụ kiện**




*Người hướng dẫn*: **GV. ĐẶNG HUỲNH TRUNG TÍN**

*Người thực hiện*: **NGUYỄN TRÍ THANH – 51900217**

**NGUYỄN QUỐC THÁI – 51900211**

**Nhóm: 12 – Tổ: 1**



**THÀNH PHỐ HỒ CHÍ MINH, NĂM 2022**


TỔNG LIÊN ĐOÀN LAO ĐỘNG VIỆT NAM** 

**TRƯỜNG ĐẠI HỌC TÔN ĐỨC THẮNG** 

**KHOA CÔNG NGHỆ THÔNG TIN** 


![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.001.png)



**Tạo chương trình terminal Java tính giá tiền một chiếc xe ô tô đi kèm với phụ kiện**




*Người hướng dẫn*: **GV. ĐẶNG HUỲNH TRUNG TÍN**

*Người thực hiện*: **NGUYỄN TRÍ THANH – 51900217**

**NGUYỄN QUỐC THÁI – 51900211**

**Nhóm: 12 – Tổ: 1**


**THÀNH PHỐ HỒ CHÍ MINH, NĂM 2022**
9

**LỜI CẢM ƠN**

Trước tiên, nhóm nghiên cứu xin gửi lời cảm ơn chân thành và lòng biết ơn sâu sắc đến GV. Đặng Huỳnh Trung Tín. Thầy là người đã luôn hỗ trợ và hướng dẫn tận tình cho chúng tôi trong suốt quá trình nghiên cứu và hoàn thành bài tiểu luận.

Tiếp theo, nhóm chúng tôi xin gửi lời cảm ơn đến khoa Công Nghệ Thông Tin trường Đại học Tôn Đức Thắng vì đã tạo điều kiện cho chúng tôi được học tập và nghiên cứu môn học này. Khoa đã luôn sẵn sàng chia sẻ các kiến thức bổ ích cũng như chia sẻ các kinh nghiệm tham khảo tài liệu, giúp ích không chỉ cho việc thực hiện và hoàn thành đề tài nghiên cứu mà còn giúp ích cho việc học tập và rèn luyện trong quá trình thực hành tại trường Đại học Tôn Đức Thắng nói chung.

**Xin chân thành cảm ơn!**
**


**ĐỒ ÁN ĐƯỢC HOÀN THÀNH**

**TẠI TRƯỜNG ĐẠI HỌC TÔN ĐỨC THẮNG**

Tôi xin cam đoan đây là sản phẩm đồ án của riêng tôi / chúng tôi và được sự hướng dẫn của Giảng viên Doãn Xuân Thanh. Các nội dung nghiên cứu, kết quả trong đề tài này là trung thực và chưa công bố dưới bất kỳ hình thức nào trước đây. Những số liệu trong các bảng biểu phục vụ cho việc phân tích, nhận xét, đánh giá được chính tác giả thu thập từ các nguồn khác nhau có ghi rõ trong phần tài liệu tham khảo.

Ngoài ra, trong đồ án còn sử dụng một số nhận xét, đánh giá cũng như số liệu của các tác giả khác, cơ quan tổ chức khác đều có trích dẫn và chú thích nguồn gốc.

**Nếu phát hiện có bất kỳ sự gian lận nào tôi xin hoàn toàn chịu trách nhiệm về nội dung đồ án của mình.** Trường đại học Tôn Đức Thắng không liên quan đến những vi phạm tác quyền, bản quyền do tôi gây ra trong quá trình thực hiện (nếu có).

*TP. Hồ Chí Minh, ngày   tháng   năm*      

*Tác giả*

*(ký tên và ghi rõ họ tên)*

*Nguyễn Trí Thanh*

*Nguyễn Quốc Thái*
\*


**PHẦN XÁC NHẬN VÀ ĐÁNH GIÁ CỦA GIẢNG VIÊN**

**Phần xác nhận của GV hướng dẫn**

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

`	`Tp. Hồ Chí Minh, ngày     tháng   năm   

`	`(kí và ghi họ tên)

**Phần đánh giá của GV chấm bài**

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

`	`Tp. Hồ Chí Minh, ngày     tháng   năm   

`	`(kí và ghi họ tên)

**MỤC LỤC**

[LỜI CẢM ƠN	1](#_Toc30562)

[PHẦN XÁC NHẬN VÀ ĐÁNH GIÁ CỦA GIẢNG VIÊN	3](#_Toc8946)

[MỤC LỤC	4](#_Toc17295)

[CHƯƠNG 1 – Giới thiệu về ứng dụng	6](#_Toc16253)

[CHƯƠNG 2 – Yêu cầu về ứng dụng và cách thực thi ứng dụng	7](#_Toc6996)

[1 Yêu cầu	7](#_Toc7711)

[2 Cách thực thi	7](#_Toc825)

[CHƯƠNG 3 – KIẾN THỨC CƠ BẢN	8](#_Toc14888)

[1 Decorator pattern	8](#_Toc5781)

[1.1 Giới thiệu	8](#_Toc8654)

[1.2 Lý do sử dụng	8](#_Toc29209)

[1.3 Nếu không sử dụng	8](#_Toc28934)

[1 Factory method pattern	8](#_Toc5058)

[1.1 Giới thiệu	8](#_Toc16437)

[1.2 Lý do sử dụng	9](#_Toc25431)

[1.3 Nếu không sử dụng	9](#_Toc3375)

[CHƯƠNG 4 – Triển khai ứng dụng	10](#_Toc28637)

[1 Decorator pattern	10](#_Toc6494)

[1.1 Class diagram	10](#_Toc4521)

[1.2 Chi tiết ứng dụng	10](#_Toc19984)

[1.2.1 Lớp interface xe ô tô	10](#_Toc24051)

[1.2.2 Lớp chứa thông tin xe ô tô	11](#_Toc53)

[1.2.3 Lớp trường tượng decorator	11](#_Toc26)

[1.2.4 Lớp chứa thông tin phụ kiện	12](#_Toc30490)

[2 Factory method pattern	13](#_Toc28156)

[2.1 Class diagram	13](#_Toc30176)

[2.2 Chi tiết ứng dụng	14](#_Toc22539)

[2.2.1 Lớp interface hãng sản xuất xe ô tô	14](#_Toc17851)

[2.2.2 Lớp tên hãng sản xuất xe ô tô	15](#_Toc31491)

[2.2.3 Lớp danh sách tên các hãng sản xuất xe	15](#_Toc28494)

[2.2.4 Lớp factory	15](#_Toc26743)

[2.2.5 Lớp chứa thông tin xe ô tô	16](#_Toc910)

[CHƯƠNG 5 – Kết quả thực tế	18](#_Toc17543)

[1 Lớp main tính giá tiền	18](#_Toc6419)

[2 Kết quả đạt được	18](#_Toc10875)

[CHƯƠNG 6 – Thông tin người phát triển	19](#_Toc2255)

[1 Sinh viên 1	19](#_Toc14112)

[2 Sinh viên 2	19](#_Toc3443)

[TÀI LIỆU THAM KHẢO	20](#_Toc28437)

[PHỤ LỤC	21](#_Toc17169)










**CHƯƠNG 1 – Giới thiệu về ứng dụng**

Đây là bài báo cáo tạo 1 chương trình Java bằng terminal tính giá tiền của một chiếc xe ô tô kèm theo phụ kiện mua riêng. Thông tin cơ bản của một chiếc xe gồm tên hãng sản xuất (ví dụ: Honda, Kia, Toyota, …), tên xe (ví dụ: hãng Honda có Honda City, Honda CRV, …) và giá tiền. Thông tin của một món phụ kiện gồm tên phụ kiện, giá tiền. Trong chương trình sử dụng 2 mẫu thiết là Factory Method Pattern và Decorator Pattern.




















**CHƯƠNG 2 – Yêu cầu về ứng dụng và cách thực thi ứng dụng**

**1 Yêu cầu**

`	`Chỉ chạy ứng dụng bằng terminal qua Visual Studio Code, không có yêu cầu cài đặt hoặc cơ sở dữ liệu.

**2 Cách thực thi**

\* Chú thích: vì đây là demo nhỏ làm tại trường lớp nên dùng phần mềm edit code để chạy chương trình.

Bước 1: Vào link <https://github.com/TDTU-IT-DP/51900217_51900211_MidTerm>

Bước 2: Chọn nút Code -> chọn Download ZIP -> giải nén vào 1 thư mục tùy ý

Bước 3: Vào Visual Studio Code

Bước 4: Chọn File -> Open Folder -> Chọn thư mục chứa source code vừa giải nén

Bước 5: Chọn file Client.java để thực thi chương trình

`	`Cách 1: 

1) Nhấn Ctrl+Shift+` để mở terminal
1) Gõ javac Client.java
1) Gõ java Client -> kết quả

`	`Cách 2:

1) Tải extension “Code Runner”
1) Nhấn Ctrl+Shift+N -> kết quả















**CHƯƠNG 3 – KIẾN THỨC CƠ BẢN**

**1 Decorator pattern**

***1.1 Giới thiệu***

Decorator pattern là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). Nó cho phép người dùng thêm chức năng mới vào đối tượng hiện tại mà không muốn ảnh hưởng đến các đối tượng khác. Kiểu thiết kế này có cấu trúc hoạt động như một lớp bao bọc (wrap) cho lớp hiện có. Mỗi khi cần thêm tính năng mới, đối tượng hiện có được wrap trong một đối tượng mới (decorator class).[1]

***1.2 Lý do sử dụng***

- Dễ dàng mở rộng thêm nhiều phụ kiện mới cho ô tô
- Không có sự khác biệt nhiều khi đưa vào 1 wrap thay vì là 1 đối tượng gốc.
- Một đối tượng có thể được bao bọc bởi nhiều wrapper cùng một lúc, tức là một chiếc xe ô tô có thể gắn thêm nhiều phụ kiện cùng lúc.
- Có thể thêm-sửa-xóa tính năng của đối tượng lúc thực thi.

***1.3 Nếu không sử dụng***

- Một class có sử dụng từ khóa final thì không thể mở rộng bằng tính kế thừa.
- Code dài, phức tạp hơn, có thể thay đổi các thuộc tính của đối tượng nếu muốn thêm hoặc bớt gì đó.
- Nhiều trường sử dụng kế thừa mà không có decorator sẽ tốn nhiều công sức khi xây dựng chương trình.

**1 Factory method pattern**

***1.1 Giới thiệu***

Factory Method Design Pattern hay gọi ngắn gọn là Factory Pattern là một trong những Pattern thuộc nhóm Creational Design Pattern. Nhiệm vụ của Factory Pattern là quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đổi tượng một cách linh hoạt hơn.[2]

***1.2 Lý do sử dụng***

`	`Mô hình này giúp chúng ta đưa trách nhiệm của việc khởi tạo một lớp từ phía người dùng (client) sang lớp Factory.

`	`Giúp chuơng trình độc lập với những lớp cụ thể mà chúng ta cần tạo 1 đối tượng, code ở phía client không bị ảnh hưởng khi thay đổi logic ở factory hay sub class

`	`Trong demo khi tạo một chiếc xe sẽ có tên của hãng sản xuất. Nếu tạo 1 lúc 10 chiếc xe cùng 1 hãng thì sẽ phải nhập cùng 1 tên nhiều lần. Ta dùng factory để khởi tạo tên hãng sản xuất trong từng loại xe.

***1.3 Nếu không sử dụng***

`	`Vì đây chỉ là demo nhỏ nên nếu không áp dụng factory vẫn được. Nhưng khi khởi tạo một 1 dùng cho ứng dụng quản lý lớn hơn thì sẽ khó khăn hơn.

Ví dụ: trang quản lý nhân viên của một khách sạn, khi khởi tạo 1 loạt khoảng 10 nhân viên làm vĩnh viễn có lương khởi điểm là 400.000 đồng/giờ và 5 nhân viên làm theo hợp đồng có lương khởi điểm là 300.000 đồng/giờ thì khi nhập từng nhân viên 1 sẽ rất tốn thời gian. Ta sẽ dùng factory để lựa chọn loại nhân viên và trả về tự động tiền lương mà không cần phải nhập.





**CHƯƠNG 4 – Triển khai ứng dụng**

**1 Decorator pattern**

***1.1 Class diagram***

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.002.png)

***1.2 Chi tiết ứng dụng***

1.2.1 Lớp interface xe ô tô

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.003.png)

1.2.2 Lớp chứa thông tin xe ô tô

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.004.png)

1.2.3 Lớp trường tượng decorator

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.005.png)

1.2.4 Lớp chứa thông tin phụ kiện

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.006.png)

**2 Factory method pattern**

***2.1 Class diagram***

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.007.png)

***2.2 Chi tiết ứng dụng***

2.2.1 Lớp interface hãng sản xuất xe ô tô

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.008.png)

2.2.2 Lớp tên hãng sản xuất xe ô tô

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.009.png)

2.2.3 Lớp danh sách tên các hãng sản xuất xe

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.010.png)

2.2.4 Lớp factory

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.011.png)

2.2.5 Lớp chứa thông tin xe ô tô

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.012.png)













**CHƯƠNG 5 – Kết quả thực tế**

**1 Lớp main tính giá tiền**

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.013.png)

**2 Kết quả đạt được**

![](Aspose.Words.16e33b23-2de8-43a5-af3f-b1346a77d3d4.014.png)










**CHƯƠNG 6 – Thông tin người phát triển**

**1 Sinh viên 1**

Họ và tên: Nguyễn Trí Thanh

MSSV: 51900217

Nhóm: 12 - Tổ: 1

Email TDTU: <51900217@student.tdtu.edu.vn> 

Email cá nhân: <nguyentrithanh1311@gmail.com> 

Username Github: ThanhNG1311 - Nguyễn Trí Thanh

**2 Sinh viên 2**

Họ và tên: Nguyễn Quốc Thái

MSSV: 51900211

Nhóm: 12 - Tổ: 1

Email TDTU: [51900211@student.tdtu.edu.vn](mailto:51900217@student.tdtu.edu.vn) 

Email cá nhân: [quocthai05022@gmail.com](mailto:nguyentrithanh1311@gmail.com) 

Username Github: Thai05022 - mnguyenquocthai










**TÀI LIỆU THAM KHẢO**

[1] GP Coder, Hướng Dẫn Java Design Pattern - Decorator, 8-11-2018, <https://gpcoder.com/4574-huong-dan-java-design-pattern-decorator/>

[2] GP Coder, Hướng Dẫn Java Design Pattern - Factory Method, 12-9-2018, <https://gpcoder.com/4352-huong-dan-java-design-pattern-factory-method/>




















**PHỤ LỤC**

