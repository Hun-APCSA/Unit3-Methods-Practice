#!/bin/bash

cd "$(dirname "$0")/.." || exit 1

echo "Updating Unit..."

git checkout main

# Save any uncommitted student work
git add .
git commit -m "Saving current work before update." || true

# Get the latest teacher version
git fetch origin

# Keep a backup of the student's current main
git branch -f main-backup

# Put the student's commits on top of the updated teacher version
git rebase -X ours origin/main

# Update GitHub
git push --force-with-lease origin main

echo
echo "Update complete!"