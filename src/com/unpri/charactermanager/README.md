
# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi Project

Character Manager merupakan aplikasi berbasis Java yang dibuat untuk menerapkan konsep Object-Oriented Programming (OOP). Project ini mengimplementasikan class, object, constructor, encapsulation, enum, getter, setter, dan method untuk mengelola karakter dalam sebuah game.

Pada Sprint #1, project dikembangkan dengan menambahkan atribut Mana, validasi nilai Mana, method `isAlive()`, serta fitur `levelUp()` untuk meningkatkan level karakter dan memperbarui statistiknya.

## Fitur Utama

- Membuat karakter menggunakan constructor.
- Menggunakan enum `CharacterType` untuk menentukan jenis karakter.
- Encapsulation menggunakan atribut private.
- Getter dan setter untuk mengakses serta mengubah data karakter.
- Validasi level, hit points, attack power, dan mana.
- Method `levelUp()` untuk meningkatkan level karakter.
- Method `isAlive()` untuk memeriksa status hidup karakter.
- Method `toString()` untuk menampilkan informasi karakter.

## Teknologi yang Digunakan

- Java Development Kit (JDK) 17
- Visual Studio Code
- Git dan GitHub

## Screenshot Output Program

### 1. Output Daftar Karakter

![Output Daftar Karakter](screenshots/output-karakter.png)

### 2. Output Mini-Challenge Mana dan isAlive()

![Output Mini Challenge](screenshots/output-minichallenge.png)

## Struktur Folder Project

```text
CharacterManager/
│
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               │
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
│
├── screenshots/
│   ├── output-karakter.png
│   └── output-minichallenge.png
│
└── README.md
```

## Contoh Implementasi Mini-Challenge

```java
Character shadow = new Character(
    "Shadow",
    CharacterType.ASSASSIN,
    6
);

shadow.setMana(150);

System.out.println(shadow.getMana());
System.out.println(shadow.isAlive());
```

Output:

```text
150
true
```

## Identitas Mahasiswa

| Keterangan | Informasi |
|---|---|
| Nama | Alga Vancany Yunita Purba |
| NIM | 253303621269 |
| Program Studi | Sarjana Sistem Informasi |
| Fakultas | Sains dan Teknologi |
| Universitas | Universitas Prima Indonesia |
| Mata Kuliah | Java Visual |
| Kode Mata Kuliah | SIH-6406 |

## Dokumentasi Analisis Desain

Google Docs:

[JavaVisual_TP03_2533036212_Alga Vancany Yunita(https://docs.google.com/document/d/1ZYXXrvSimTg-zZKCt7ZDSSMAazwRgTQa5tb1kKx1kJA/edit?usp=sharing))

Dokumen tersebut berisi analisis ekosistem Java, konsep encapsulation, constructor, enum, diagram UML, dan refleksi desain berdasarkan implementasi Character Manager Sprint #1.

## Author

**Alga Vancany Yunita Purba**

Universitas Prima Indonesia (UNPRI)

Program Studi Sistem Informasi

---

*Character Manager Sprint #1 — Java Visual SIH-6406*
