
# Character Manager

Java Visual - Universitas Prima Indonesia (UNPRI)

## Informasi Project

| Keterangan | Detail |
|---|---|
| Project | Character Manager |
| Sprint | Sprint #4 |
| Tugas | TP10 - AP13 |
| Mata Kuliah | Java Visual |
| Bahasa Pemrograman | Java |
| GUI Framework | Java Swing |
| Konsep | OOP, MVC, GUI Theming |

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
│           ├── AppTheme.java
│           └── MainWindow.java
├── screenshots/
│   ├── TP10-Before.png
│   └── TP10-After.png
└── README.md
```

---

# TP8 - Character Manager Sprint #3

## MainWindow, Data Dinamis & Analisis MVC

Pada Sprint #3, aplikasi Character Manager dikembangkan dari program console menjadi aplikasi GUI menggunakan Java Swing.

Fitur yang diterapkan:
- JFrame sebagai jendela utama.
- JPanel untuk menampilkan karakter.
- JScrollPane untuk daftar karakter.
- Data karakter ditampilkan secara dinamis menggunakan perulangan.
- Statistik jumlah karakter dan rata-rata level.
- SwingUtilities.invokeLater() untuk menjalankan GUI.

### Alur Data MVC

Main.java membuat objek CharacterManager dan menambahkan data karakter. CharacterManager berfungsi sebagai Model yang mengelola kumpulan data. MainWindow berfungsi sebagai View yang mengambil data dari Model dan menampilkannya kepada pengguna. Pemisahan ini membuat pengelolaan data dan tampilan aplikasi menjadi lebih terstruktur.

---

# TP10 - Character Manager Sprint #4

## Theming, Properti Komponen & Analisis MVC

### Deskripsi

Pada Sprint #4, aplikasi Character Manager dikembangkan dengan menerapkan sistem tema menggunakan AppTheme.java.

Tujuannya adalah memisahkan pengaturan tampilan dari logika pengelolaan data agar aplikasi lebih konsisten, mudah dikembangkan, dan memiliki struktur kode yang lebih baik.

### A. Implementasi Tema

File AppTheme.java digunakan untuk menyimpan pengaturan tampilan aplikasi, meliputi:

- Warna background utama.
- Warna teks.
- Warna berdasarkan role karakter.
- Font judul dan informasi.
- Border komponen.
- Pemetaan warna menggunakan method colorFor().

MainWindow menggunakan AppTheme sebagai pusat pengaturan tampilan tanpa mendefinisikan warna dan font secara langsung.

### B. Mini-Challenge

Karakter dengan level minimal 5 mendapatkan teks berwarna emas dan tebal.

Batas level disimpan dalam konstanta:

`HIGH_LEVEL_THRESHOLD = 5`

### Daftar Karakter

| Nama | Role | Level |
|---|---|---:|
| Arthur | WARRIOR | 5 |
| Gatotkaca | WARRIOR | 7 |
| Merlin | MAGE | 3 |
| Morgana | MAGE | 6 |
| Robin | ARCHER | 4 |
| Shadow | ASSASSIN | 1 |

### Dua Properti Tambahan

**1. Tooltip**

Menggunakan setToolTipText() untuk menampilkan informasi detail karakter, termasuk nama, role, HP, dan Attack Power ketika kursor diarahkan ke kartu karakter.

Alasan: memudahkan pengguna memperoleh informasi tambahan tanpa memenuhi tampilan utama dengan terlalu banyak teks.

**2. Border berdasarkan Role**

Setiap kartu karakter menggunakan border dengan warna yang disesuaikan dengan role melalui method borderFor().

Alasan: memudahkan pengguna membedakan kategori karakter secara visual dan membuat tampilan lebih konsisten.

### C. Screenshot Aplikasi

#### Before - MainWindow v0.3

Versi sebelum penerapan AppTheme.

![TP10 Before](screenshots/OUTPUT SPRINT 4 V.04.png)

#### After - MainWindow v0.4

Versi sesudah penerapan AppTheme, role-based color, dan highlight level tinggi.

![TP10 After](screenshots/V.03.png)

### D. Mengapa Warna Disimpan di AppTheme?

Warna disimpan di AppTheme karena pengaturan tampilan merupakan tanggung jawab View dalam konsep MVC. Character sebagai Model seharusnya hanya menyimpan informasi dan karakteristik data, seperti nama, role, level, HP, dan Attack Power. Jika warna disimpan di dalam Character, Model akan bergantung pada komponen presentasi sehingga pemisahan tanggung jawab menjadi kurang baik. Dengan AppTheme, perubahan tampilan dapat dilakukan tanpa mengubah struktur Model dan aturan pengelolaan data.

### E. Google Docs - Analisis Properti & MVC

Dokumentasi analisis TP10:

[Java Visual TP10 - Analisis Properti & MVC https://docs.google.com/document/d/1iKdJJd23U-3HRd0__CXKbo0j7XV7Vrr-E0DKajIQWiY/edit?tab=t.0#heading=h.o7l3pu3awiw7 )

---

## Kesimpulan

Sprint #4 mengembangkan tampilan Character Manager menggunakan sistem tema terpusat melalui AppTheme. Implementasi ini menerapkan pemisahan tanggung jawab antara Model dan View, pemetaan warna berdasarkan role, penggunaan logical font, serta pengaturan properti komponen Swing.

Aplikasi sekarang memiliki tampilan yang lebih konsisten, mudah dikembangkan, dan lebih terstruktur.
