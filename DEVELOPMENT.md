# AndiCar - Local Development

## Development Environment Setup

### Required Tools
- Android SDK (API level 27, 33 recommended)
- JDK 11 (for CI) / JDK 21 (for local development)

### Local Configuration

1. Create `local.properties` in the project root:
```bash
# If Android SDK is installed elsewhere, update this path
echo "sdk.dir=/path/to/android-sdk" > local.properties
```

2. For Android SDK, you can download from:
   - https://developer.android.com/studio
   - Or use command-line tools: https://developer.android.com/studio/command-line

### Build Commands
```bash
./gradlew assembleDebug  # Debug build
./gradlew assembleRelease # Release build
./gradlew lint           # Lint analysis
```

### CI Notes
- GitHub Actions workflow automatically sets up Android SDK
- Local builds require manual SDK setup

## GitHub Authentication

### For CI/CD (Recommended)
GitHub automatically provides a `GITHUB_TOKEN` secret in workflows. No additional setup needed.

```yaml
# In .github/workflows/build.yml
- uses: actions/checkout@v4
  with:
    token: ${{ secrets.GITHUB_TOKEN }}
```

### For Local Development (Optional)
If you need to push changes from this environment:

1. Create a Personal Access Token (PAT):
   - Go to: https://github.com/settings/tokens/new
   - Select scopes: `repo` (full control)
   - Copy the token

2. Store locally (NOT in repository):
   ```bash
   # Set as environment variable
   export GITHUB_TOKEN="ghp_xxxxxxxxxxxx"
   
   # Or use gh CLI (recommended)
   gh auth login
   ```

3. The agent will prompt you for the PAT when needed.

### Security Notes
- **Never commit credentials** to the repository
- **Never store** PAT in any file in the project
- **Revoke tokens** you no longer need
- Use GitHub's built-in `GITHUB_TOKEN` in CI workflows