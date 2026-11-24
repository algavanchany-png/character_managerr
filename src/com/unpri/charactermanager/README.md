
# Character Manager

**Java Visual - Universitas Prima Indonesia (UNPRI)**

Project ini merupakan pengembangan aplikasi Character Manager menggunakan bahasa pemrograman Java dan Java Swing.

## Informasi Project

| Keterangan | Detail |
|---|---|
| Project | Character Manager |
| Sprint | Sprint #3 |
| Tugas | TP8 - AP10 |
| Mata Kuliah | Java Visual |
| Bahasa | Java |
| GUI Framework | Java Swing |
| Konsep | OOP, MVC, Event-Driven Programming |

## Struktur Project

```text
CharacterManager/
├── src/
│   └── com/unpri/charactermanager/
│       ├── Main.java
│       ├── model/
│       │   ├── Character.java
│       │   ├── CharacterType.java
│       │   └── CharacterManager.java
│       └── view/
│           └── MainWindow.java
├── screenshots/
│   ├── TP8-Before.png
│   └── TP8-After.png
└── README.md
```

## TP8 - Character Manager Sprint #3

### MainWindow, Data Dinamis & Analisis MVC

Pada sprint ini, aplikasi Character Manager dikembangkan dari program berbasis console menjadi aplikasi berbasis Graphical User Interface (GUI) menggunakan Java Swing.

### Fitur Implementasi

- MainWindow menggunakan JFrame.
- Menampilkan data karakter secara dinamis menggunakan perulangan.
- Menggunakan JPanel untuk menampilkan kartu karakter.
- Menggunakan JScrollPane untuk daftar karakter.
- Menampilkan jumlah karakter.
- Menghitung statistik rata-rata level karakter.
- Menggunakan SwingUtilities.invokeLater() untuk menjalankan GUI.

### Daftar Karakter

| Nama | Tipe | Level | Alasan Pemilihan |
|---|---|---:|---|
| Arthur | WARRIOR | 5 | Karakter petarung dengan level menengah. |
| Merlin | MAGE | 3 | Karakter penyihir dengan level awal. |
| Robin | ARCHER | 4 | Karakter pemanah dengan kemampuan seimbang. |
| Morgana | MAGE | 6 | Karakter penyihir dengan level lebih tinggi. |
| Athena | ARCHER | 7 | Karakter pemanah dengan level tinggi. |

### Statistik Karakter

Jumlah karakter: 5

Total level: 25

Rata-rata level: 5.00

Rumus:

Rata-rata Level = Total Level / Jumlah Karakter

### Screenshot Aplikasi

#### Sebelum Perubahan Data

![TP8 Before](src/com/unpri/charactermanager/screenshots/TERMINAL OUTPUT SPRINT 3 BEFORE.png)

#### Sesudah Perubahan Data

![TP8 After](src/com/unpri/charactermanager/screenshots/TERMINAL OUTPUT SPRINT 3 AFTER.png)

### Analisis Aliran Data dan MVC

Aliran data aplikasi dimulai dari Main.java yang membuat objek CharacterManager dan menambahkan data karakter menggunakan method addCharacter(). Selanjutnya, objek CharacterManager menyimpan dan mengelola kumpulan data karakter. MainWindow menerima objek CharacterManager melalui constructor, kemudian mengambil data menggunakan getAllCharacters() dan menampilkannya secara dinamis menggunakan perulangan. Dengan konsep MVC, CharacterManager berperan sebagai bagian Model yang mengelola data, sedangkan MainWindow berperan sebagai View yang bertanggung jawab menampilkan informasi kepada pengguna.

### Konsep Event-Driven Programming

Aplikasi GUI menggunakan pendekatan event-driven programming. Berbeda dengan program console yang menjalankan instruksi secara berurutan, aplikasi GUI dapat menunggu interaksi pengguna atau event tertentu untuk menjalankan proses.

### Google Docs - Analisis GUI & MVC

Dokumentasi analisis Bagian D:

[Java Visual TP8 - Analisis GUI & MVC](https://docs.google.com/document/d/1Hj7ydaICSuB1yNE1RJtG0xxb4lDeT7WdjJKfeLuvxrA/edit?usp=sharing  )

---

## Kesimpulan

TP8 berhasil mengembangkan Character Manager dari aplikasi console menjadi aplikasi GUI menggunakan Java Swing. Implementasi ini menerapkan konsep OOP, pemisahan Model dan View, data dinamis, serta penghitungan statistik karakter.
