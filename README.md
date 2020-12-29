# Library_App

•	JDK 1.8 kurunuz.Kurulu değilse lütfen indiriniz.(İnternet araması örn:java jdk 1.8) 
•	Veritabanı için mysql workbench kurunuz. 
•	Eclipce indiriniz ,kurulu değilse lütfen kurunuz.library_app projesi import edilir.
•	Mysql erişim için application.properties dosyasına, mysql bilgilerini belirlediğiniz port numarası, kullanıcı adı ve şifre bilgileri girilmelidir.
•	Proje çalıştırıldıktan sonra herhangi bir web tarayıcısı açılarak http://localhost:portno   adresine gidilir.(belirlenen port adresi girilir.)
•	Burada belirlenen port 8082dir.



           Yaptığım çeşitli teknik seçimleri / kabulleri ve nedenlerini gerekçelendirmeleri :
           
 Jpa repository kullanarak kod fazlalığından ve kendini sürekli tekrar kodlardan kurtulmayı hedefledim,
 ekstra olarak kod okunurluğunu ve takibini daha iyi bir hale gelmesini amaçladım.
 Spring framework ise şuanki en popüler framework ve çok kullanışlı olduğu için kullandım.
 Maven ise tüm geliştiricilerin ortak bir yapısı olduğu için projeler arası geçişi kolaylaştıracağını amaçladım.
 Thymeleaf yada jsp kullanma amaca duruma göre değişibilir.
