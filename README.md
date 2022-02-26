# jetpack component navigation sample practice
- có thể dùng navigation để mở fragment và activity, dùng safe args để pass data giữa các fragment và activity
- có thể navigate dùng action id hoac destination id, do đó ko nhất thiết phải tạo action trong navigation graph
- app:PopupTo sẽ destroy fragment cũ và tạo mới
- navigation luôn gọi onCreateView của fragment mỗi khi navigate đến do đó ví dụ như man hình map mà muốn giữ lại last state sẽ ko đc
- có thể dùng navOptions để mở fragment hay activity với animation, flag
- phải dùng cách cũ để mở fragment nếu muốn fragment giữ lại last state của view vì navigation luốn create lại view
