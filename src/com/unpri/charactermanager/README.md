# TP12 - Character Manager Sprint #5

## Layout, UI Responsif & Analisis MVC

### 1. Deskripsi

Pada Sprint #5, aplikasi Character Manager dikembangkan
dengan menggunakan BorderLayout, BoxLayout, GridLayout,
dan JScrollPane.

Tujuan pengembangan ini adalah membuat tampilan aplikasi
lebih responsif ketika ukuran jendela berubah.

### 2. Implementasi Layout

Aplikasi menggunakan empat wilayah BorderLayout:

| Wilayah | Komponen | Fungsi |
|---|---|---|
| NORTH | Header dan statistik | Menampilkan judul dan statistik karakter |
| CENTER | JScrollPane | Menampilkan daftar karakter |
| EAST | Legend Panel | Menjelaskan warna berdasarkan role |
| SOUTH | Status Bar | Menampilkan status dan versi aplikasi |

### 3. Panel Tambahan

Panel statistik menggunakan GridLayout(2, 2).

Layout ini dipilih karena informasi statistik terdiri
dari empat bagian yang perlu ditampilkan secara teratur
dalam dua baris dan dua kolom.

FlowLayout tidak dipilih karena posisi komponennya
mengikuti aliran horizontal dan dapat berpindah baris
ketika ruang tersedia berubah.

### 4. Struktur Panel Bersarang

MainPanel menjadi container utama aplikasi.

HeaderPanel berisi judul dan StatisticsPanel.
CharacterPanel berada di dalam ListWrapper yang
kemudian dimasukkan ke JScrollPane.
LegendPanel berada di EAST, sedangkan StatusPanel
berada di SOUTH.

Struktur ini memisahkan setiap bagian antarmuka
agar lebih mudah dikembangkan.

### 5. Wireframe

Sisipkan gambar wireframe aplikasi di sini.

### 6. Pengujian Responsive Layout

![alt text](<../../../../screenshots/TERMINAL OUTPUT SPRINT 5.png>)

### 7. Tabel Pengamatan Resize

| Pengujian | Prediksi | Hasil |
|---|---|---|
| Ukuran awal | Semua panel terlihat | Isi panel tampil |
| Jendela diperlebar | Area CENTER bertambah luas | Kartu mendapat ruang lebih luas |
| Jendela diperkecil | Scrollbar muncul jika konten tidak muat | Scrollbar vertikal muncul |

### 8. Analisis MVC

Pengaturan layout berada di package View karena
layout merupakan bagian dari presentasi antarmuka.

Model tetap mengelola data karakter dan aturan bisnis.
View mengatur bagaimana data tersebut ditampilkan.

Pemisahan ini membuat aplikasi lebih fleksibel
dan mudah dikembangkan.

### 9. Google Docs

Link Analisis TP12:

[(https://docs.google.com/document/d/1Kxv-E4ZcHrXY8oa1qOW9hKyvnrYYd0IZRMDx6knVnew/edit?tab=t.0)]