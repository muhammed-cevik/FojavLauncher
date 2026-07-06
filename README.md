<h1 align="center">Fojav Launcher</h1>

<img src="https://github.com/PojavLauncherTeam/PojavLauncher/blob/v3_openjdk/app_pojavlauncher/src/main/assets/pojavlauncher.png" align="left" width="130" height="150" alt="Fojav Launcher logo">

[![Android CI](https://github.com/muhammed-cevik/FojavLauncher/workflows/Fojav%20Launcher%20CI/badge.svg)](https://github.com/muhammed-cevik/FojavLauncher/actions)

*PojavLauncher tabanlı, eski Android cihazlar için optimize edilmiş Minecraft: Java Edition başlatıcısı.*

Fojav Launcher, Android cihazlarınızda Minecraft: Java Edition oynamanızı sağlayan, düşük donanımlı ve eski cihazlara özel performans iyileştirmeleri yapılmış bir başlatıcıdır.

---

## Özellikler

- 🚀 **Eski cihaz optimizasyonu** — Düşük RAM ve zayıf CPU'lar için özel ayarlar
- ⚡ **Büyük çekirdek önceliği** — CPU'nun güçlü çekirdeklerini varsayılan olarak kullanır
- 🎮 **Shader cache** — Oyun her açılışta daha hızlı yüklenir
- 📦 **Paket adı:** `com.tdev.fojavlauncher`
- 🔧 **Minimum Android:** 5.0 (API 21)

---

## İndirme

En güncel APK'yı [Actions](https://github.com/muhammed-cevik/FojavLauncher/actions) sekmesinden indirebilirsiniz.

---

## Derleme

```bash
git clone https://github.com/muhammed-cevik/FojavLauncher.git
cd FojavLauncher
./gradlew :app_pojavlauncher:assembleDebug
```

APK çıktısı: `app_pojavlauncher/build/outputs/apk/debug/`

---

## Desteklenen Minecraft Sürümleri

- rd-132211'den 1.21 snapshot'larına kadar neredeyse tüm sürümler
- Forge ve Fabric mod desteği
- ARM32, ARM64, x86, x86_64 mimariler

---

## Lisans

Bu proje [GPL-3.0](LICENSE) lisansı altında dağıtılmaktadır.  
PojavLauncher kaynak koduna dayanmaktadır: [PojavLauncherTeam](https://github.com/PojavLauncherTeam/PojavLauncher)
