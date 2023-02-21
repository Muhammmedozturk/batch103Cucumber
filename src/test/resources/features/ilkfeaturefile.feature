@googlesearch
Feature: ilk feature file
  Background: Google_sayfasına_git
    Given kullanici google gider
 @iphone
  Scenario: TC01_google_iphone_arama
    Given kullanici google gider
    When kullanici iphone için arama yapar
    Then sonuclarda iphone oldugunu dogrular
  And close the application


  @tesla
  Scenario: TC02_google_tesla_arama
  Given kullanici google gider
  When kullanıcı tesla için arama yapar
  Then sonuclarda tesla olduğunu doğrular
  Then close the application


#  1. Her feature file, Feature: kelimesi ile baslamak zorundadir
#  2. Her bir file da, yanliz bit Feature: kullanilabilir
#  3. Senaryo(TEST CASE) olusturmak icin Scenario kelimesi kullanilir
#  4. Birden fazla Scenario: kullanilabilir
#  5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
#  6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
#  7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
#  8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
#  NOTE: Teknik olarak istenilen kelime isteniler step de kullanilabilir,
#        ama anlam karmasasi olmamasi icin bu adimlar takip edilir
#        Belirli senaryoları çalıştırmak için feature scenario scenario outline examples kelimeleri ile birlikte kullanılır
# Background her bir senaryo kelimesinden önce tek bir sefer çalışır
