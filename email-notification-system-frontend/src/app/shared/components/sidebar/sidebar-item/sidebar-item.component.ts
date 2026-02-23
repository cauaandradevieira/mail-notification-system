import { Component, EventEmitter, Input, input, Output, signal } from '@angular/core';

export interface SidebarItem
{
  label: string,
  routerLink: string,
  active: boolean
}

@Component({
  selector: 'app-sidebar-item',
  imports: [],
  templateUrl: './sidebar-item.component.html',
  styleUrl: './sidebar-item.component.css'
})
export class SidebarItemComponent {
  @Input() item!: SidebarItem;
  @Output() onClickedEmit = new EventEmitter<string>();
  

  onClicked()
  {
    this.onClickedEmit.emit(this.item.label);
  }
}
