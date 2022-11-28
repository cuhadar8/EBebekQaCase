# EBebekQaCase

ebebek sitesi üzerinde, Selenium Webdriver ile Java dilinde gerçekleştirdiğim test senaryosu.

Bu test ile aşağıdaki test adımlarını sırasıyla uyguladım.
1- ebebek sitesi açılır
2- Arama çubuğuna "kaşık maması" yazılır ve aratılır. Arama sonucunda listenin en sonundaki ürün sayfası açılır.
3- Listedeki bu ürün ile sayfası açılan ürünün aynı olduğu doğrulanır ve ürün sepete eklenir.
4- Açılan sayfada "Sepeti Gör" butonuna tıklanır.
5- "Alışverişi Tamamla" butonuna tıklanır
6- Üyelik ekranının açıldığı doğrulanır.

Vermiş olduğum bu sıraya göre, "main" dosyası içindeki "testPages" paketi altında bulunan sınıfların,
HomePage > SearchPage > ProductPage > CartPage > LoginPage sırasıyla incelenmesi kod akışının anlaşılması için faydalı olacaktır.

"test/java" dosyası içinde bulunan BaseTest sınıfında @Before annotation ile tanımladığım setUp methodunda site adresini, bildirimlere
izin ver penceresinin kapatmak için option objesini, sitenin penceresinin tam ekran yapılmasını ve siteye ilk giriş emrini verdim.
@Test annotation ile test adımlarımızı sırasıyla ilerlettim.

HomePage sınıfı ebebek anasayfası üzerinde yaptığımız işlemleri içeriyor. Arama çubuğununun konumunu id ile tepit edip tıkladım ve 
"kaşık maması" nı aratacağımız String değişkeni alan method içinde Enter tuşuyla aratmayı sağladım.

SearchPage sınıfında listenen ürünlerin sonuncuna gitmek için iki kere scroll down emri verdim ve çıkan son ürünün xpath i ile
ürüne tıkladım.

ProductPage sınıfında listedeki ürün ile sayfası açılan ürünün aynı olduğunu Assert kullanarak doğruladım. Ürünü sepete ekleme ve sepeti 
gör komutlarını da bu classta tanımladım.

CartPage sınıfında alışverişi tamamla butonunun xpath'i yardımıyla butona tıkladım.

LoginPage sınıfındaysa üyelik giriş ekranının gelip gelmediğini kontrol ettim.


