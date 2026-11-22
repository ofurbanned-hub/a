# ShutoffTrollMod — Fabric Notepad prank

This is a **real Fabric client mod** for **Minecraft 1.20.1 and 1.21.1**, usable with Modrinth, Prism, and the official launcher when Fabric Loader is installed. Each Minecraft version needs its matching JAR. Other versions are not yet supported.

On Windows, Minecraft startup opens Notepad containing `get ratted by e4 ez`. No tokens, cookies, or personal data are accessed. **This project does not shut down or restart the PC.**

## Build using GitHub
1. Create a new GitHub repository.
2. Upload the contents of this ZIP, not the ZIP itself. The hidden `.github/workflows/build.yml` file must be included.
3. If GitHub's browser uploader skips `.github`, use **Add file → Create new file**, enter `.github/workflows/build.yml` as the filename, and paste the content from the ZIP.
4. Commit changes, then go to **Actions → Build Fabric mods → Run workflow**.
5. Download the matching artifact and unzip it. Inside `build/libs`, choose the main `.jar` **without `-sources`**.
6. In Modrinth, open your Fabric instance, click **Add content → Add file**, and select the matching JAR; or place it in that instance's `mods` folder.

## Compatibility
- `fabric-1.20.1`: Java 17, Minecraft 1.20.1 Fabric.
- `fabric-1.21.1`: Java 21, Minecraft 1.21.1 Fabric.
- Not compatible with vanilla-only profiles, Forge, or arbitrary Minecraft versions.

The GitHub Actions build has not been run in this environment. If it fails, inspect the build log and adjust dependencies or Gradle versions as needed.
