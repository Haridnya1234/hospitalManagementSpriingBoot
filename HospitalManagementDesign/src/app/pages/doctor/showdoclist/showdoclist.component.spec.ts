import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowdoclistComponent } from './showdoclist.component';

describe('ShowdoclistComponent', () => {
  let component: ShowdoclistComponent;
  let fixture: ComponentFixture<ShowdoclistComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowdoclistComponent]
    });
    fixture = TestBed.createComponent(ShowdoclistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
