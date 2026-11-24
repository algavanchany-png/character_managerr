
# Character Manager

Aplikasi Java sederhana untuk mengelola data karakter menggunakan konsep Object-Oriented Programming (OOP).

## Identitas

- **Nama:** Alga Vancany Yunita Purba
- **NIM:** [ISI NIM]
- **Program Studi:** Sistem Informasi
- **Universitas:** Universitas Prima Indonesia
- **Mata Kuliah:** Java Visual

---

# TP3 - Sprint #1
## Build, Extend & Analyze Class Skeleton

### Deskripsi
Membangun struktur dasar Character Manager menggunakan Java dengan menerapkan konsep class, object, constructor, encapsulation, dan enum.

### Fitur
- Membuat objek Character.
- Menggunakan CharacterType.
- Mengatur atribut karakter melalui constructor dan setter.
- Menghitung HP dan Attack Power berdasarkan level.
- Menambahkan properti Mana.
- Memeriksa status karakter menggunakan isAlive().

### Screenshot

![Output Character](screenshots/output-karakter.png)

![Output Mini Challenge](screenshots/output-minichallenge.png)

---

# TP5 - Sprint #2
## CharacterManager, Analytics & Object Reference

### Deskripsi
Mengembangkan aplikasi Character Manager dengan fitur pengelolaan data karakter, analisis data, serta pemahaman konsep object reference pada Java.

### Fitur Utama

1. **Add Character**
   - Menambahkan karakter baru.
   - Menolak karakter dengan nama duplikat.

2. **Find Character**
   - Mencari karakter berdasarkan nama.

3. **Remove Character**
   - Menghapus karakter berdasarkan nama.

4. **Character Analytics**
   - Menghitung jumlah karakter.
   - Menghitung rata-rata level.
   - Mencari karakter berdasarkan tipe.
   - Menghitung jumlah karakter berdasarkan tipe.

5. **Defensive Copy**
   - Menggunakan salinan ArrayList agar perubahan pada daftar hasil tidak mengubah daftar internal CharacterManager.

6. **Object Reference**
   - Menguji hubungan dua variabel yang menunjuk objek yang sama.
   - Menggunakan copy constructor untuk membuat objek independen.

7. **Static Counter**
   - Menghitung total objek Character yang telah dibuat.

### Custom Feature: countByType()

Method `countByType()` digunakan untuk menghitung jumlah karakter berdasarkan tipe tertentu.

Fitur ini membantu pengguna mengetahui jumlah karakter Warrior, Mage, Archer, atau Assassin tanpa harus mengakses ArrayList internal secara langsung.

Method ini juga menjaga prinsip encapsulation karena data internal tetap bersifat private.

### Screenshot
![alt text](<screenshots/OUTPUT TERMINAL SPRINT 2.png>)
---

## Struktur Project

```text
character_manager/
│
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               │
│               └── model/
│                   ├── Character.java
│                   ├── CharacterManager.java
│                   └── CharacterType.java
│
├── screenshots/
│   ├── output-karakter.png
│   ├── output-minichallenge.png
│   ├── tp5-crud.png
│   ├── tp5-analytics.png
│   ├── tp5-defensive-copy.png
│   ├── tp5-reference.png
│   └── tp5-static-counter.png
│
└── README.md
```

---

## Teknologi

- Java JDK 17
- Visual Studio Code
- Git
- GitHub

## Dokumentasi Analisis


- **TP5:** [https://docs.google.com/document/d/1w-ZLNuCGWYLtGJEnl95HBE_sf676Owdr9LcjKeZFc3M/edit?usp=sharing ]

---

## Author

**Alga Vancany Yunita Purba**  
Sistem Informasi  
Universitas Prima Indonesia
