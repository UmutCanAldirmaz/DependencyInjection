package com.hopecoding.dependencyinjection.manuel

/*
   1-Dependency Inversion nedir?

   Cevap -->

    Bazı sınıflar diğer sınıflara göre top level kalmaktadır. Şöyle örneklendirebiliriz

    1 Adet Ana Sınıf ve 1 Adet Yardımcı sınıf olduğunu düşünelim. Bu iki sınıf arasında ilişki gevşek olmalı.

    Birbirine sıkı sıkıya bağlı olmamalı. Bir sınıfın nesnesi başka bir sınıfın içinde direkt oluşturuluyorsa

    bu iki sınıfta tightlyCoupled denir.

    Eğer nesne diğer sınıfın içinde oluşmayıp, constructor veya set şeklinde verilmesine Loose Coupled denir.

    ----------------------------------------------------------------------------------------------------------------------------------

    2-Inversion of Control nedir?

    Cevap -->

    Bir sınıfın kendisi o sınıfın nesnesinin üretilmesinden veya fonksiyonların kullanılmasından direkt olarak

    sorumlu olmamasıdır. Bunun kontrol edilmesidir.


    ----------------------------------------------------------------------------------------------------------------------------------

    3-Coupling ve Cohesion terimleri nelerdir? Arasındaki ilişkiyi açıklayın?

    Cevap -->

    Önce bu terimleri tek tek açıklayalım.

    Coupling (Bağlanırlık):

    *Bir modülün (veya sınıfın) başka bir modüle olan bağımlılık düzeyidir.
    *Düşük coupling(Loose Couple), modüller arasında zayıf bağımlılık anlamına gelir. Bu da bağımsızlık ve esneklik sağlar.

    Cohesion (Tutarlılık):

    *Bir modülün kendi içindeki öğelerinin birbiriyle ne kadar ilişkili olduğudur.
    *Yüksek cohesion, bir modülün tek bir sorumluluk veya amaca odaklandığını gösterir.

    Şimdi arasındaki ilişkiyi şöyle açıklayabiliriz;

    Coupling ve Cohesion arasında ters bir ilişki vardır:

    *Düşük Coupling & Yüksek Cohesion: İyi bir yazılım tasarımının hedefidir.
        Modüller birbirine az bağımlıdır ancak her biri kendi içinde tutarlı ve iyi organize edilmiştir.

    *Yüksek Coupling & Düşük Cohesion: Kötü tasarıma işaret eder.
        Modüller hem birbiriyle fazla bağımlıdır hem de kendi içlerinde karmaşıktır.


    || Özellik !!     || Coupling !!                            || Cohesion !!                              ||
    -----------------------------------------------------------------------------------------------------------
    || Odak Noktası   || Moduller arasındaki bağımlılık         || Modül içindeki elemanların ilişkisi      ||
    -----------------------------------------------------------------------------------------------------------
    || Amaç	          || Bağımsızlık ve esneklik	            || Tutarlılık ve modülerlik                 ||
    -----------------------------------------------------------------------------------------------------------
    || Düzey	      || Modüller arası	                        || Modül içi                                ||
    -----------------------------------------------------------------------------------------------------------
    || Tercih Edileni || Düşük Coupling (Zayıf bağlanırlık)     || Yüksek Cohesion (Güçlü tutarlılık)       ||
    -----------------------------------------------------------------------------------------------------------
    || Sonuç	      || Daha az etkilenme (Değişikliklerden)   || Daha kolay bakım ve genişletilebilirlik  ||

    Özetle ;

    * Coupling: Bir modülün dış dünyaya ne kadar bağımlı olduğunu belirler.
    * Cohesion: Modülün kendi içinde ne kadar organize ve odaklı olduğunu belirler.
    * Hedef: Düşük Coupling ve Yüksek Cohesion ile modüler, esnek ve sürdürülebilir bir yazılım tasarımı oluşturmak.




 */