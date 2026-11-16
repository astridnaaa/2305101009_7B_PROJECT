# Pengumpulan UTS Pemrograman Mobile


# Identitas Mahasiswa

- Nama  : Astrid Nabila
- NIM   : 2305101009
- Kelas : 7B
- Program Studi  : Teknik Informatika
- Mata Kuliah  : Pemrograman Mobile
- Tahun Akademik  : 2026

# Deskripsi

Repository ini berisi source code, dokumentasi, dan hasil implementasi
aplikasi mobile untuk pengerjaan Ujian Tengah Semester (UTS)
mata kuliah Pemrograman Mobile.

# Deskripsi Pengerjaan UTS


Dalam tugas UTS ini saya membuat **Aplikasi Pengingat Masa Kedaluwarsa Produk Skincare** menggunakan Android Studio dan bahasa pemrograman Kotlin.
Aplikasi ini bertujuan untuk membantu pengguna mencatat dan mengingat tanggal kedaluwarsa produk skincare.
Pengembangan aplikasi meliputi pembuatan halaman utama, daftar produk, dan halaman reminder.
Dalam prosesnya, saya menerapkan pembuatan layout, penggunaan Activity, serta navigasi antarhalaman menggunakan Intent.
Beberapa fitur, khususnya penyimpanan dan pengambilan data produk, masih dalam tahap proses. Jadi aplikasi yang saya buat
belum 100% jadi.

# Teknologi Yang Digunakan

Bahasa Pemrograman: Kotlin
Framework/Platform: Android SDK, AndroidX AppCompat
Tools: Android Studio, Gradle
Layout: XML Layout
Navigasi: Intent dan Activity
Database: Belum diterapkan (masih dalam tahap proses)

# Fitur Yang Diimplementasikan

Halaman Utama : Menampilkan tampilan awal aplikasi sebagai halaman navigasi.
Daftar Produk : Menampilkan daftar produk skincare yang akan dikelola pengguna.
Pengingat Kedaluwarsa : Menyediakan halaman reminder untuk menampilkan informasi masa kedaluwarsa produk.
Navigasi Antarhalaman : Menghubungkan halaman aplikasi menggunakan Intent dan Activity.
Informasi Produk : Menampilkan data contoh produk sebagai gambaran informasi produk skincare.

# Struktur Folder

BeautyExpiry/: Folder utama project Android Studio.
- app/: Folder utama aplikasi Android.
  - src/main/java/com/example/beautyexpiry/: Source code aplikasi menggunakan Kotlin.
    - MainActivity.kt: Halaman utama aplikasi.
    - ProductListActivity.kt: Mengatur tampilan dan daftar produk skincare.
    - ReminderActivity.kt: Mengatur halaman pengingat masa kedaluwarsa produk.
  - src/main/res/layout/: File XML untuk mengatur tampilan antarmuka aplikasi.
  - src/main/res/drawable/: Menyimpan aset gambar dan ikon aplikasi.
  - src/main/res/values/: Menyimpan konfigurasi warna, teks, dan tema aplikasi.
  - src/main/AndroidManifest.xml: Mengatur deklarasi Activity dan konfigurasi aplikasi.
- build.gradle.kts: Konfigurasi proses build aplikasi.
- settings.gradle.kts: Konfigurasi project Android Studio.

# Persyaratan Menjalankan Aplikasi

Sistem Operasi: Windows 10/11 untuk menjalankan Android Studio.
IDE: Android Studio.
Bahasa Pemrograman: Kotlin.
Android SDK: Terpasang dan dikonfigurasi pada Android Studio.
JDK: Menggunakan JDK yang didukung oleh versi Android Studio dan Gradle.
Perangkat Pengujian: Emulator Android atau smartphone Android.
Penyimpanan: Ruang penyimpanan yang cukup untuk project, proses build, dan instalasi aplikasi.
Koneksi Internet: Dibutuhkan saat mengunduh dependency dan konfigurasi awal project.

# Cara Menjalankan Aplikasi

1. Buka aplikasi Android Studio pada laptop atau komputer.
2. Pilih Open, kemudian cari dan buka folder project BeautyExpiry.
3. Tunggu proses Gradle Sync hingga selesai.
4. Pastikan perangkat emulator atau smartphone Android sudah terhubung.
5. Pilih perangkat yang akan digunakan untuk menjalankan aplikasi.
6. Klik tombol Run (Shift + 10)
7. Tunggu proses build dan instalasi aplikasi selesai.

# Screenshot Hasil Implementasi

Screenshot tersimpan pada folder 'Screenshot'

- halaman dashboard : tampilan awal
- halaman daftar produk
- halaman tambah produk
- halaman reminder

# Referensi

- Android Studio – Dokumentasi penggunaan Android Studio.
https://developer.android.com/studio
- GitHub – Referensi contoh project aplikasi Android.
https://github.com/
