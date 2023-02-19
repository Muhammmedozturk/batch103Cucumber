Feature: ilk feature file
  Scenario: TC01_google_iphone_arama
  Given kullanıcı google gider
  When kullanıcı iphone icin arama yapar
  Then sonuclarda iphone olduğunu doğrular

  #   1. her feature file Feature: kelimesi ile başlamak zorundadır
  #   2. her bir filede yanlız bir Feature: kullanılabilir
  #   3. Senaryo(TEST CASE) oluşturmak için Scenario kelimesi kullanılır
  #   4. Birden fazla Scenario kullanılabilir
  #   5.her bir adım Given, and, Then, But, * kelimelerden biriyle başlamalıdır
  #   6. Given -> genelde ilk satırlarda pre condition stepleri için kullanılır
  #   7. Then -> Genelde son satırlarda verification stepleri için kullanılır
  #   8. And when genelde ara adımlard bağlar olarak kullanılabilir
  # NOTE: teknik olarak istenilen kelime istenilen stepte kullanılabilir
  #       ama anlam karmaşası olmaması için bu adımlar takip edilir

