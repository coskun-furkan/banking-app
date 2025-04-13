# Banka Hesap Yönetimi Uygulaması

Bu proje, Spring Boot kullanılarak geliştirilmiş basit bir banka hesap yönetim sistemidir. MySQL veritabanı ile entegre çalışır. RESTful API'ler aracılığıyla hesap oluşturma, para yatırma, para çekme ve hesap bilgilerini listeleme gibi işlemleri yapabilirsiniz.

---

## Proje Amacı

Bu uygulamanın amacı, Java Spring Boot framework'ü ile temel CRUD işlemlerini öğrenmek ve uygulamak; aynı zamanda veritabanı bağlantısı (MySQL) ve REST API mantığını kavramaktır.

---

## ⚙️ Kullanılan Teknolojiler

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (API testleri için)
- Maven
- Spring Web
- Lombok

---

## 🔧 Kurulum

### 1. Veritabanı Kurulumu

MySQL'de aşağıdaki komutla bir veritabanı oluşturun:

```sql
CREATE DATABASE Banking;
```

### 2. application.properties Ayarları

`src/main/resources/application.properties` dosyasına aşağıdaki satırları ekleyin:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/Banking
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update


> Not: Kullanıcı adı ve şifreyi kendi sisteminize göre değiştirin.

---

## 🧱 Katmanlar ve Dosyalar

### ✅ Model Katmanı - `Account.java`

- Veritabanındaki `account` tablosunu temsil eder.
- Alanlar:
  - `id` (otomatik artan)
  - `accountHolderName` (Hesap sahibinin adı)
  - `balance` (Bakiye)

### ✅ Repository Katmanı - `AccountRepository.java`

- `JpaRepository` arayüzünü kullanır.
- Veritabanı işlemleri otomatik olarak sağlanır.

### ✅ Service Katmanı - `AccountService.java`

- Tüm iş mantığı burada yer alır.
- Hesap oluşturma, para yatırma, para çekme gibi işlemleri içerir.

### ✅ Controller Katmanı - `AccountController.java`

- API endpoint'leri burada tanımlanır.
- İstemciden gelen HTTP isteklerini karşılar.

### ✅ Ana Uygulama - `BankingProjectApplication.java`

- Uygulamanın çalışmasını başlatan ana sınıftır.

---

## Postman ile API Testi

Aşağıda, `/api/accounts` endpoint'ine yapılan bir GET isteği sonucunun ekran görüntüsü yer almaktadır:

![Get All Accounts](images/get_all_accounts_screenshot.png)

---

## 📌 API Endpoint'leri

| Metot | Endpoint                    | Açıklama               |
|-------|-----------------------------|------------------------|
| GET   | `/api/accounts`             | Tüm hesapları getirir |
| GET   | `/api/accounts/{id}`        | Belirli bir hesabı getirir |
| POST  | `/api/accounts`             | Yeni hesap oluşturur |
| POST  | `/api/accounts/{id}/deposit` | Hesaba para yatırır |
| POST  | `/api/accounts/{id}/withdraw`| Hesaptan para çeker |

---

## 📬 Katkıda Bulunma

Tüm katkılar, hata raporları, hata düzeltmeleri, belge iyileştirmeleri, geliştirmeler ve fikirler hoş karşılanmaktadır.

---

##  Teşekkürler

Bu projeyi öğrenme sürecinde bir basamak olarak kullanan herkese teşekkür ederim.
