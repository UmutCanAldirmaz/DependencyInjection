package com.hopecoding.dependencyinjection.manuel

/*
    1. Dependency Injection Nedir?
Bağımlılık Enjeksiyonu,sınıfların ihtiyaç duydukları bağımlılıkları doğrudan oluşturmak yerine dışarıdan sağlanmasıdır.
Bu, sınıflarınızın daha modüler ve test edilebilir olmasını sağlar.


    // Bağımlılık
class Service {
    fun performTask() = "Görev Tamamlandı!"
}

// DI olmadan (kötü örnek)
class Client {
    private val service = Service()

    fun execute() = service.performTask()
}

// DI ile (iyi örnek)
class Client(private val service: Service) {
    fun execute() = service.performTask()
}

// Kullanım
val service = Service()
val client = Client(service)
println(client.execute()) // Görev Tamamlandı!

----------------------------------------------------------------------------------------------------------------------------------

    2. Constructor Injection
Bağımlılıkları doğrudan sınıfın yapıcı (constructor) fonksiyonuyla enjekte etme yöntemidir. En yaygın kullanılan yöntemdir.

class Repository {
    fun fetchData() = "Veri Çekildi!"
}

class ViewModel(private val repository: Repository) {
    fun getData() = repository.fetchData()
}

// Kullanım
val repository = Repository()
val viewModel = ViewModel(repository)
println(viewModel.getData()) // Veri Çekildi!

----------------------------------------------------------------------------------------------------------------------------------

    3. Setter Injection
Bağımlılıkları, sınıfın özel ayarlayıcı (setter) fonksiyonlarıyla enjekte eder. Daha esnektir ancak yanlış yapılandırma riskine sahiptir.

class Service {
    fun performTask() = "Görev Başarıyla Yapıldı!"
}

class Client {
    private var service: Service? = null

    fun setService(service: Service) {
        this.service = service
    }

    fun execute() = service?.performTask() ?: "Hizmet Yok!"
}

// Kullanım
val service = Service()
val client = Client()
client.setService(service)
println(client.execute()) // Görev Başarıyla Yapıldı!

----------------------------------------------------------------------------------------------------------------------------------

    4. Interface Injection
Bağımlılık, bir arabirim aracılığıyla sağlanır. Daha az yaygındır ve genellikle özel durumlar için kullanılır.


interface Service {
    fun performTask(): String
}

class ConcreteService : Service {
    override fun performTask() = "Görev Arabirim Üzerinden Yapıldı!"
}

class Client(private var service: Service) {
    fun execute() = service.performTask()
}

// Kullanım
val service = ConcreteService()
val client = Client(service)
println(client.execute()) // Görev Arabirim Üzerinden Yapıldı!

----------------------------------------------------------------------------------------------------------------------------------

                Dependency Injection Mülakat Soruları ve Cevapları

1. Dependency Injection (DI) nedir? Neden kullanılır?

Soru: Dependency Injection nedir ve yazılım geliştirmede neden önemlidir?
Cevap: DI, bir sınıfın bağımlılıklarının dışarıdan sağlanmasıdır. Bu, kodun daha modüler, test edilebilir ve sürdürülebilir olmasını sağlar.
        Ayrıca bağımlılık yönetimini kolaylaştırır ve sınıfların sorumluluklarını ayrıştırır.

----------------------------------------------------------------------------------------------------------------------------------

2. DI’nin avantajları nelerdir?

Soru: Dependency Injection kullanmanın avantajları nelerdir?
Cevap:
        Daha kolay test edilebilir kod.
        Daha az bağımlı, modüler sınıflar.
        Kodun bakımı ve genişletilmesi kolaylaşır.
        Bağımlılıkların yeniden kullanılabilirliği artar.

----------------------------------------------------------------------------------------------------------------------------------

3. DI yöntemleri nelerdir?

Soru: Dependency Injection için kullanılan yöntemler nelerdir?
Cevap:

        Constructor Injection: Bağımlılıklar yapıcı fonksiyon ile sağlanır.
        Setter Injection: Bağımlılıklar setter metotları ile sağlanır.
        Interface Injection: Bağımlılıklar bir arabirim aracılığıyla sağlanır.

----------------------------------------------------------------------------------------------------------------------------------
4. Constructor Injection ile Setter Injection arasındaki fark nedir?

Soru: Constructor Injection ve Setter Injection arasındaki farklar nelerdir?
Cevap:

        Constructor Injection: Bağımlılıklar zorunludur; sınıf başlatıldığında sağlanır.
        Setter Injection: Bağımlılıklar isteğe bağlıdır; sınıf oluşturulduktan sonra ayarlanabilir.

----------------------------------------------------------------------------------------------------------------------------------
5. DI olmadan bağımlılıkları nasıl yönetirdiniz?

Soru: Dependency Injection olmadan bağımlılıkları nasıl yönetirdiniz?
Cevap: DI olmadan sınıf içinde bağımlılıklar manuel olarak oluşturulurdu. Ancak bu, kodun modülerliğini ve test edilebilirliğini azaltır.

----------------------------------------------------------------------------------------------------------------------------------
6. DI ve Service Locator farkı nedir?
Soru: Dependency Injection ile Service Locator arasındaki fark nedir?
Cevap:

        DI: Bağımlılık doğrudan dışarıdan sağlanır.
        Service Locator: Bağımlılıklar merkezi bir servis sağlayıcıdan sorgulanır. DI, genellikle daha temiz bir yaklaşım olarak kabul edilir.

----------------------------------------------------------------------------------------------------------------------------------
7. Hangi durumlarda DI kullanımı önerilmez?
Soru: Dependency Injection kullanmaktan kaçınılması gereken durumlar nelerdir?
Cevap:

        Küçük ve basit projelerde.
        Fazla bağımlılığı olmayan sınıflarda.
        Performansın çok kritik olduğu yerlerde (örneğin, aşırı karmaşık DI yapılandırmaları performansı etkileyebilir).

----------------------------------------------------------------------------------------------------------------------------------

8. Singleton ve Scoped bağımlılıkların farkı nedir?
Soru: Singleton ve Scoped bağımlılıklar arasındaki farklar nelerdir?
Cevap:

        Singleton: Uygulama boyunca bir kez oluşturulan bağımlılıklardır.
        Scoped: Bağımlılık her bir işlem veya bağlam (örneğin, bir oturum) için yeniden oluşturulur.

----------------------------------------------------------------------------------------------------------------------------------

9. DI Framework’leri nelerdir?

Soru: Hangi Dependency Injection framework'leri popülerdir?
Cevap:

        Koin: Kotlin'e özgü, kolay öğrenilebilir bir framework.
        Hilt: Google destekli, Android projeleri için optimize edilmiş.
        Dagger: Performansı yüksek, Java ve Android projelerinde yaygın.


 */

