# Contributing to AndiCar

Thank you for your interest in contributing!

## Git Best Practices

Based on [Git Guides](https://github.com/git-guides)

### Essential Commands

```bash
# Clone repository
git clone https://github.com/DivideZAR/AndiCarv2.git

# Check current state
git status

# List branches
git branch

# Create new branch
git checkout -b feature/my-feature

# Stage changes
git add filename.kt
git add .  # Stage all

# Commit with descriptive message
git commit -m "Add feature: description of changes"

# Pull latest changes
git pull origin master

# Push to remote
git push origin feature/my-feature
```

### Git Workflow

1. **Create branch** off `master` — name by feature/function
2. **Make changes** — commit early, commit often
3. **Push** to remote — `git push -u origin [branch-name]`
4. **Open pull request** — describe what/why/how
5. **Collaborate** — respond to reviews, update as needed
6. **Merge** — after approval, squash if needed
7. **Delete branch** — clean up after merge

### Best Practices

#### Do

- Commit often with descriptive messages
- Use feature branches (not direct to master)
- Pull before pushing to avoid conflicts
- Open PRs early for feedback
- Keep commits atomic (one change per commit)
- Link issues in PR description

#### Don't

- Never commit secrets, API keys, or credentials
- Never force push to master/main
- Avoid large commits (split if needed)
- Don't leave PRs open for too long

### Pull Request Guidelines

1. Branch from latest `master`
2. Keep PRs focused and small
3. Include clear description:
   - What was changed
   - Why it was needed
   - How to test it
4. Link related issues
5. Request review from maintainers

### Code Review

- Be constructive and respectful
- Explain why, not just what
- Accept feedback gracefully
- Test changes before requesting review

---

**Questions?** Open an issue or start a discussion.