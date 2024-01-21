class SimpleCRUDApp:
    def __init__(self):
        self.data = {}

    def show_menu(self):
        print("\n===== CRUD App Menu =====")
        print("1. Tambah Item")
        print("2. Lihat Semua Item")
        print("3. Hapus Item")
        print("4. Keluar")

    def tambah_item(self):
        nama = input("Masukkan nama item: ")
        self.data[len(self.data) + 1] = nama
        print(f"Item '{nama}' berhasil ditambahkan.")

    def lihat_semua_item(self):
        if not self.data:
            print("Belum ada item.")
        else:
            print("\n=== Semua Item ===")
            for item_id, nama in self.data.items():
                print(f"ID: {item_id}, Nama: {nama}")

    def hapus_item(self):
        self.lihat_semua_item()
        item_id = int(input("Masukkan ID item yang akan dihapus: "))
        if item_id in self.data:
            del self.data[item_id]
            print(f"Item dengan ID {item_id} berhasil dihapus.")
        else:
            print(f"Item dengan ID {item_id} tidak ditemukan.")

    def run(self):
        while True:
            self.show_menu()
            choice = input("Pilih operasi (1-4): ")

            if choice == '1':
                self.tambah_item()
            elif choice == '2':
                self.lihat_semua_item()
            elif choice == '3':
                self.hapus_item()
            elif choice == '4':
                print("Terima kasih, aplikasi selesai.")
                break
            else:
                print("Pilihan tidak valid. Silakan coba lagi.")


# Jalankan aplikasi
app = SimpleCRUDApp()
app.run()
